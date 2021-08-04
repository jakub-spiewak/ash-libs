package com.jakubspiewak.ashapimodellib.model.file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiFileCreateRequest {

    private UUID ownerId;

    private String fileName;

    private byte[] file;

}
