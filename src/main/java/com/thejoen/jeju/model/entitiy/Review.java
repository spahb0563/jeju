package com.thejoen.jeju.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String writer;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String type;

    private Double score;

    private LocalDateTime createdAt;

    @ManyToOne
    private RentalCar rentalCar;
}
