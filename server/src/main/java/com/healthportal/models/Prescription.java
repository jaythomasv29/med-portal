package com.healthportal.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Prescriptions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    @JsonBackReference
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    @JsonBackReference
    private Patient patient;

    @Column
    private String pharmacyName;

    @Column
    private java.sql.Date rStartDate;

    @Column
    private java.sql.Date rRefillDate;

    @Column
    private Integer numberRefills;

    @Column
    //expired or not confirmed
    private String status;

}
