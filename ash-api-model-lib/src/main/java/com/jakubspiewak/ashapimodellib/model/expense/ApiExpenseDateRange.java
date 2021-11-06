package com.jakubspiewak.ashapimodellib.model.expense;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExpenseDateRange {
    private @DateTimeFormat(iso = DATE)
    LocalDate start;
    private @DateTimeFormat(iso = DATE)
    LocalDate end;
}
