package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MailConfiguration {
    private String login;
    private String password;
    private String host;
    private Integer port;
}
