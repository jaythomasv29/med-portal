package com.healthportal.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Appointments")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    private Doctor doctor;

    @ManyToOne
    @JsonBackReference
    private Patient patient;

    @Column
    private String Department;

    @Column
    private java.sql.Date rDate;

    @Column
    private java.sql.Time rTime;

    @Column
    //Could be new patient or following up appointment
    private String appcategory;

    @Column
    //confirmed or not confirmed
    private String status;
}
