package com.jakubspiewak.ashapimodellib.model.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiDocumentGetResponse {

  // TODO: Add company info etc.

  private LocalDate date;

  private UUID fileId;

  private UUID referenceId;

  private String type;
}
