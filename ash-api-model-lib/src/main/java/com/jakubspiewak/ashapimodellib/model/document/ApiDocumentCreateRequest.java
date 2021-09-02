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
public class ApiDocumentCreateRequest {

  private LocalDate date;

  private String type;

  private byte[] file;

  private UUID referenceId;
}
