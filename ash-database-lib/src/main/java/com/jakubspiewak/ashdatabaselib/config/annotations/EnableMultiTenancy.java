package com.jakubspiewak.ashdatabaselib.config.annotations;

import com.jakubspiewak.ashdatabaselib.config.config.TenantConnectionProvider;
import com.jakubspiewak.ashdatabaselib.config.config.TenantIdentifierResolver;
import com.jakubspiewak.ashdatabaselib.config.config.TenantResolverInterceptor;
import com.jakubspiewak.ashdatabaselib.config.config.WebConfiguration;
import com.jakubspiewak.ashexpenseservice.config.HibernateConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Import({
  HibernateConfig.class,
  TenantConnectionProvider.class,
  TenantIdentifierResolver.class,
  TenantResolverInterceptor.class,
  WebConfiguration.class
})
public @interface EnableMultiTenancy {}
