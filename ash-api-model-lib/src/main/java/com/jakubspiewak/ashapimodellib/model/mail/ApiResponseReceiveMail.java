package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ApiResponseReceiveMail {
    private MailConfiguration configuration;
    private String from;
    private String subject;
    private String receiptDate;
    private List<MailAttachment> attachments;
}
