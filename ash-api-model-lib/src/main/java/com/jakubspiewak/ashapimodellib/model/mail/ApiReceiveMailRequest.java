package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiReceiveMailRequest {
    private MailConfiguration configuration;
}
