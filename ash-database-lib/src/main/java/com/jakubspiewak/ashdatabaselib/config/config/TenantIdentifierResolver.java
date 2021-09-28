package com.jakubspiewak.ashdatabaselib.config.config;

import com.jakubspiewak.ashdatabaselib.config.DatabaseContextHolder;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {
  @Override
  public String resolveCurrentTenantIdentifier() {
    return Optional.ofNullable(DatabaseContextHolder.getCurrentDatabase()).orElse("ash_users");
  }

  @Override
  public boolean validateExistingCurrentSessions() {
    return true;
  }
}
