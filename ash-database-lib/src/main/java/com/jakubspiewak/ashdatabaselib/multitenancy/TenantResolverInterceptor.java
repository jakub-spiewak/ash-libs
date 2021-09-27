package com.jakubspiewak.ashdatabaselib.multitenancy;

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

    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    log.info("FROM INTERCEPTOR: IT'S WORKED");
    return Optional.ofNullable(request.getHeader("ash-user-id"))
        .map(this::setTenantContest)
        .orElse(false);
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

  private boolean setTenantContest(String userId) {
    DatabaseContextHolder.setCurrentDatabase(userId);
    return true;
  }
}
