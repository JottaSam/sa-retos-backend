package com.grupog35.reto3.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDbo {
    private int idCar;
    private String name;
    private String brand;
    private int year;
    private String description;
}
