package com.jakubspiewak.ashapimodellib.model.expense;

import com.jakubspiewak.ashapimodellib.model.util.AutoMailReceiverConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseConfigGetResponse {
  private ApiExpenseGetResponse expense;
  private List<AutoMailReceiverConfig> configs;
}
