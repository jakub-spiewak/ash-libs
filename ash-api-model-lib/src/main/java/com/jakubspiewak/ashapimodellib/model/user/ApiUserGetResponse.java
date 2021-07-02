package com.jakubspiewak.ashapimodellib.model.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiUserGetResponse {

    private UUID id;

    private String login;

    private Boolean hasConfiguredMail;
}
