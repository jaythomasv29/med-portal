package com.healthportal.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Patients")
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    // fields go here

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    private String birthDate;
    private String address;
    private String gender;
    private String phone;
    private String password;
    @ManyToOne
    @JsonBackReference
    private Doctor doctor;
    private Doctor assignedDoctor;
    private List<Prescription> medicines;
}
