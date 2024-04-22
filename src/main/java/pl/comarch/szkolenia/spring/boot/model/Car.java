package pl.comarch.szkolenia.spring.boot.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {
    private String brand;
    private String model;
    private String plate;
    private double price;
    private boolean rent;
}
