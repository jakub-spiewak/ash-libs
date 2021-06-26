package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class ApiRequestReceiveMail {
    private MailConfiguration configuration;
    private List<String> from;
    private Date minimumReceiptDate;
    private Date maximumReceiptDate;
}
