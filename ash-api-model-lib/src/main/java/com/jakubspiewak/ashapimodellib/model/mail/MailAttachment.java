package com.jakubspiewak.ashapimodellib.model.mail;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class MailAttachment {
    private String name;
    private byte[] content;
}
