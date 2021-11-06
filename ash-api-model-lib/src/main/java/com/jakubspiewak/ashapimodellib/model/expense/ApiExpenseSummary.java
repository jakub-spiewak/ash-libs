package com.jakubspiewak.ashapimodellib.model.expense;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseSummary {
    private ApiExpenseAmount amount;
    private ApiExpenseDateRange date;
    private List<ApiExpenseAmount> currency;
}
