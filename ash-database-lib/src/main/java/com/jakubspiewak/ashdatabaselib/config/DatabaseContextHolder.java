package com.jakubspiewak.ashdatabaselib.config;

public class DatabaseContextHolder {
  private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

  public static String getCurrentSchema() {
    return contextHolder.get();
  }

  public static void setCurrentSchema(String schema) {
    contextHolder.set(schema);
  }

  public static void clear() {
    contextHolder.remove();
  }
}
