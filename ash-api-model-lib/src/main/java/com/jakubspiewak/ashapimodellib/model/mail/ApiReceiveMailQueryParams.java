package com.jakubspiewak.ashapimodellib.model.mail;

import com.jakubspiewak.ashapimodellib.model.util.DateRange;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class ApiReceiveMailQueryParams {
    private List<String> from;
    private DateRange date;
}
