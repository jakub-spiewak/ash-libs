package com.jakubspiewak.ashapimodellib.model.expense;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseGetResponse {
  private UUID id;

  private String name;

  private Amount amount;

  private MailExpenseConfig mailConfig;
}
