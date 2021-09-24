package com.jakubspiewak.ashapimodellib.model.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiTokenInfo {
    private UUID userId;
    private Date expirationDate;
    private Boolean isAccepted;
}
