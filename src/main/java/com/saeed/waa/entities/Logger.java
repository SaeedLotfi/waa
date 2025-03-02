package com.saeed.waa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "loggers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID transactionId;
    private LocalDate date;
    private LocalTime time;
    private String principle;
    private String operation;

    public Logger(String operation) {
        this.operation = operation;
    }

    @PrePersist
    protected void onCreate() {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.principle = "Saeed Lotfi";
        this.transactionId = UUID.randomUUID();
    }
}
