package com.litethinking.students.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Person {

    private Long id;

    private String name;

    private String cellNumber;

    private String email;

    public void buyTicket(){
        System.out.println("Comprando pase estacionamiento...");
    }

}
