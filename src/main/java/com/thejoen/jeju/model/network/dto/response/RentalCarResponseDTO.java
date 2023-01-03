package com.thejoen.jeju.model.network.dto.response;


import com.thejoen.jeju.model.entitiy.RentalCar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RentalCarResponseDTO {

    private Long id;

    private String name;

    private String address;

    private Integer numberOfTotalVehicles;

    private Integer numberOfVans;

    private Integer numberOfVehicles;

    private Integer numberOfElectricVehicles;

    private LocalDateTime openTime;

    private LocalDateTime closeTime;

    private String tel;

    private String homePage;

    private Double lat;

    private Double lon;

    public RentalCarResponseDTO(Long id, String name, String address, String tel, Double lat, Double lon) {
        this.id = id;
        this.name = name;
        this.address = address.replace("제주특별자치도 ", "");
        this.tel = tel;
        this.lat = lat;
        this.lon = lon;
    }

    public RentalCarResponseDTO(RentalCar rentalCar) {
        this.id = rentalCar.getId();
        this.name = rentalCar.getName();
        this.address = rentalCar.getAddress();
        this.numberOfTotalVehicles = rentalCar.getNumberOfTotalVehicles();
        this.numberOfVans = rentalCar.getNumberOfVans();
        this.numberOfElectricVehicles = rentalCar.getNumberOfElectricVehicles();
        this.numberOfVehicles = rentalCar.getNumberOfVehicles();
        this.openTime = rentalCar.getOpenTime();
        this.closeTime = rentalCar.getCloseTime();
        this.tel = rentalCar.getTel();
        this.homePage = rentalCar.getHomePage();
        this.lat = rentalCar.getLat();
        this.lon = rentalCar.getLon();
    }
}
