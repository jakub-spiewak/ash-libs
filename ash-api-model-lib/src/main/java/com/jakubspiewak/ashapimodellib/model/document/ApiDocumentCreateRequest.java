package com.jakubspiewak.ashapimodellib.model.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiDocumentCreateRequest {
    private UUID ownerId;
    private String fileName;
    private byte[] file;
}
