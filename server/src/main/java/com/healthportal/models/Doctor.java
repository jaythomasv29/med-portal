package com.healthportal.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.healthportal.dtos.DoctorDTO;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Getter
@Setter
@Table(name = "doctors")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    // fields go here
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String doctor_id;


//    private List<Patient> patientList;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonBackReference
    private List<Appointment> appointmentSet;



//    public Doctor(String firstName, String lastName, String doctor_id, List<Patient> patientList){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.doctor_id = doctor_id;
//        this.patientList = patientList;
//    }

    public Doctor(DoctorDTO doctorDTO){
        this.firstName = doctorDTO.getFirstName();
        this.lastName = doctorDTO.getLastName();
        this.doctor_id = doctorDTO.getDoctor_id();
//        this.patientList = doctorDTO.getPatientList();
    }


}
