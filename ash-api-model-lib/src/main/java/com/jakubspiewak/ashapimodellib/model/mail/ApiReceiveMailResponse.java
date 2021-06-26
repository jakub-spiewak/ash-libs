package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class ApiReceiveMailResponse {
    private String from;
    private String subject;
    private Date receiptDate;
    private List<MailAttachment> attachments;
}
