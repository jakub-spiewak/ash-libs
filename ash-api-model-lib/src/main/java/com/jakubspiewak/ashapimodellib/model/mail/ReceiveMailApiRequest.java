package com.jakubspiewak.ashapimodellib.model.mail;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ReceiveMailApiRequest {
    private List<String> from;
    private Date minimumReceiptDate;
    private Date maximumReceiptDate;
}
