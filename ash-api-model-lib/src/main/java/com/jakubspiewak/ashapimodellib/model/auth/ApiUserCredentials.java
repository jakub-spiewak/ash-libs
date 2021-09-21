package com.jakubspiewak.ashapimodellib.model.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiUserCredentials {
  private String username;
  private String password;
}
