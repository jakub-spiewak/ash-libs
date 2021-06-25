package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Data;

import java.util.List;

@Data
public class ApiReceiveMailResponse {
    private String from;
    private String subject;
    private String receiptDate;
    private List<MailAttachment> attachments;
}
