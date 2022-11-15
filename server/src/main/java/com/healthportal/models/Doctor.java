package com.healthportal.models;

import com.healthportal.dtos.DoctorDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
public class Doctor {
    // fields go here
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String doctor_id;
    private List<Patient> patientList;

    public Doctor(){}

    public Doctor(String firstName, String lastName,
                  String doctor_id, List<Patient> patientList){
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctor_id = doctor_id;
        this.patientList = patientList;
    }

    public Doctor(DoctorDTO doctorDTO){
        this.firstName = doctorDTO.getFirstName();
        this.lastName = doctorDTO.getLastName();
        this.doctor_id = doctorDTO.getDoctor_id();
        this.patientList = doctorDTO.getPatientList();
    }


}
