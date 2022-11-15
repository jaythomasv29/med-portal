package com.healthportal.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Department;

    @Column(name = "patient_id")
    private Patient patient;

    @Column(name = "doctor_id")
    private Doctor doctor;

}
