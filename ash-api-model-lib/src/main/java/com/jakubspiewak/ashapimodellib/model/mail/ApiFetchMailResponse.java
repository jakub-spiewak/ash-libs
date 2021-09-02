package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiFetchMailResponse {
  private String from;
  private String subject;
  private LocalDate receiptDate;
  private List<MailAttachment> attachments;
}
