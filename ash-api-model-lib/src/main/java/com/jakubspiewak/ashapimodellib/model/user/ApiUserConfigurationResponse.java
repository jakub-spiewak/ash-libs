package com.jakubspiewak.ashapimodellib.model.user;

import com.jakubspiewak.ashapimodellib.model.mail.MailConfiguration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiUserConfigurationResponse {
  private UUID userId;
  private MailConfiguration mail;
}
