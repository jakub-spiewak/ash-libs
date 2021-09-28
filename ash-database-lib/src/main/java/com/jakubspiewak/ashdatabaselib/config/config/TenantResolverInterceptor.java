package com.jakubspiewak.ashdatabaselib.config.config;

import com.jakubspiewak.ashdatabaselib.config.DatabaseContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Slf4j
@Component
public class TenantResolverInterceptor implements AsyncHandlerInterceptor {
  @Override
  public boolean preHandle(
      HttpServletRequest request, HttpServletResponse response, Object handler) {

    return Optional.ofNullable(request.getHeader("ash-user-id"))
        .map(this::setTenantContext)
        .orElse(true);
  }

  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
    DatabaseContextHolder.clear();
  }

  private boolean setTenantContext(String userId) {
    final var schemaName = String.format("user_%s", userId).replace("-", "_");
    DatabaseContextHolder.setCurrentDatabase(schemaName);
    return true;
  }
}
