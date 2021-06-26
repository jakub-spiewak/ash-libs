package com.jakubspiewak.ashapimodellib.model.util;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class DateRange {
    private Date min;
    private Date max;
}
