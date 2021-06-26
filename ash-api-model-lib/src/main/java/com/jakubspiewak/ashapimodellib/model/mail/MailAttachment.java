package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class MailAttachment {
    private String name;
    private byte[] content;
}
