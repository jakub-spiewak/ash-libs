package com.jakubspiewak.ashapimodellib.model.expense;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseGetResponse {
  private UUID id;

  private String name;

  private Float amount;

  private MailExpenseConfig mailConfig;
}
