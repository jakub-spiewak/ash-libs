package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MailAttachment {
    private String name;
    private byte[] content;
}
