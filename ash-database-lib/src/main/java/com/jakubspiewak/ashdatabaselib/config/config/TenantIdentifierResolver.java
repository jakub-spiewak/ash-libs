package com.jakubspiewak.ashdatabaselib.config.config;

import com.jakubspiewak.ashdatabaselib.config.DatabaseContextHolder;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {
  @Override
  public String resolveCurrentTenantIdentifier() {
    return Optional.ofNullable(DatabaseContextHolder.getCurrentDatabase()).orElse("ash-users");
  }

  @Override
  public boolean validateExistingCurrentSessions() {
    return true;
  }
}
