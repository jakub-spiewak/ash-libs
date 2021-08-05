package com.jakubspiewak.ashapimodellib.model.file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiFileGetResponse {

    private String fileName;

    private byte[] file;

}