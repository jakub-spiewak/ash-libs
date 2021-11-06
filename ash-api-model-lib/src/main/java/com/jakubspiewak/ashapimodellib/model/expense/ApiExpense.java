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
public class ApiExpense {
    private UUID id;
    private String name;
    private ApiExpenseDateRange date;
    private ApiExpenseAmount amount;
    private Boolean isPrivate;
    private ApiExpenseMailConfig mailConfig;
}
