package com.jakubspiewak.ashapimodellib.model.user;

import com.jakubspiewak.ashapimodellib.model.mail.MailConfiguration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiUserMailConfigurationRequest {
  private MailConfiguration configuration;
}
