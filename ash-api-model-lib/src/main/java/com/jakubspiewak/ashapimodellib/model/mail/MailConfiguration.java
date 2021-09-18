package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailConfiguration {
  private String address;
  private String password;
  private String host;
  private Integer port;
}
