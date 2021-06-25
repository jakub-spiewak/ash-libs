package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ApiReceiveMailRequest {
    private MailConfiguration configuration;
    private List<String> from;
    private Date minimumReceiptDate;
    private Date maximumReceiptDate;
}
