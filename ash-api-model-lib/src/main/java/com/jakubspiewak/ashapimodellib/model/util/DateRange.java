package com.jakubspiewak.ashapimodellib.model.util;

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
public class DateRange {
  private @DateTimeFormat(iso = DATE) LocalDate min;
  private @DateTimeFormat(iso = DATE) LocalDate max;
}
