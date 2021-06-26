package com.jakubspiewak.ashapimodellib.model.mail;

import com.jakubspiewak.ashapimodellib.model.util.DateRange;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class ApiReceiveMailQueryParams {
    private List<String> from;
    private DateRange date;
}
