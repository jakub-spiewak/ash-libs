package com.jakubspiewak.ashapimodellib.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiUserUpdateRequest {
  private String user;
  private String password;
}
