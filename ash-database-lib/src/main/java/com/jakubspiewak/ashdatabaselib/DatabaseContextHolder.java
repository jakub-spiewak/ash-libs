package com.jakubspiewak.ashdatabaselib;

public class DatabaseContextHolder {
  private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

  public static String getCurrentDatabase() {
    return contextHolder.get();
  }

  public static void setCurrentDatabase(String database) {
    contextHolder.set(database);
  }

  public static void clear() {
    contextHolder.remove();
  }
}
