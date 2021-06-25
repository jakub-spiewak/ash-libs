package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Data;

import java.util.List;

@Data
public class ReceiveMailApiResponse {
    private String from;
    private String subject;
    private String receiptDate;
    private List<MailAttachment> attachments;
}
