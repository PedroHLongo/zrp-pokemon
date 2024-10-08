package com.zrp.pokemon.adapters.in.exception.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Error {
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Builder
    public Error(String message) {
        this.message = message;
        this.date = LocalDate.now();
    }
}
