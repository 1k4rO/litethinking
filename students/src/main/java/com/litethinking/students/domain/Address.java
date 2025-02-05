package com.litethinking.students.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
