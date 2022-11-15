package com.healthportal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    // fields go here
    @Id
    private Long id;
    String name;
    String address;
    String phone;
    int age;
}
