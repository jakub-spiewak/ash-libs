package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailAttachment {
  private String name;
  private byte[] content;
}
