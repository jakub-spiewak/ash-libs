package com.jakubspiewak.ashapimodellib.model.mail;

import com.jakubspiewak.ashapimodellib.model.util.DateRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailQueryParams {
  private List<String> from;
  private DateRange date;
}
