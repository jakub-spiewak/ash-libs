package com.jakubspiewak.ashapimodellib.model.expense;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseCreateRequest {

  private String name;

  private Amount amount;

  private Boolean isPrivate;

  private MailExpenseConfig mailConfig;
}
