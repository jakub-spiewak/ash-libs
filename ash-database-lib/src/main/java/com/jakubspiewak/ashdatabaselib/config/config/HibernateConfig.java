package com.jakubspiewak.ashexpenseservice.config;

import lombok.RequiredArgsConstructor;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;

import static org.hibernate.MultiTenancyStrategy.SCHEMA;
import static org.hibernate.cfg.AvailableSettings.*;

@Configuration
@RequiredArgsConstructor
public class HibernateConfig {
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            DataSource dataSource,
            JpaProperties jpaProperties,
            MultiTenantConnectionProvider connectionProvider,
            CurrentTenantIdentifierResolver tenantIdentifierResolver) {

        final var em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        // TODO: after common refactor change to : "com.jakubspiewak.ash"
        em.setPackagesToScan("com.jakubspiewak");
        em.setJpaVendorAdapter(jpaVendorAdapter());

        final var jpaPropertiesMap = new HashMap<String, Object>(jpaProperties.getProperties());
        jpaPropertiesMap.put(MULTI_TENANT, SCHEMA);
        jpaPropertiesMap.put(MULTI_TENANT_CONNECTION_PROVIDER, connectionProvider);
        jpaPropertiesMap.put(MULTI_TENANT_IDENTIFIER_RESOLVER, tenantIdentifierResolver);
        em.setJpaPropertyMap(jpaPropertiesMap);

        return em;
    }
}
