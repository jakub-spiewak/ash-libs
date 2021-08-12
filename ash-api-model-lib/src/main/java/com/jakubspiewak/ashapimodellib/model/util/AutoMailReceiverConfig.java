package com.jakubspiewak.ashapimodellib.model.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutoMailReceiverConfig {
  private String from;
  private String attachmentNameTemplate;
}
