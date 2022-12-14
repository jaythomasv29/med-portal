package com.healthportal.dtos;

import com.healthportal.models.Doctor;
import com.healthportal.models.Patient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String doctor_id;
//    private List<Patient> patientList;
    private String email;

    public DoctorDTO(Doctor doctor){
        this.id = doctor.getId();
        this.firstName = doctor.getFirstName();
        this.lastName = doctor.getLastName();
        this.doctor_id = doctor.getDoctor_id();
//        this.patientList = doctor.getPatientList();
    }
}
