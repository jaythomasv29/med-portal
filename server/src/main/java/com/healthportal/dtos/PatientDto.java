package com.healthportal.dtos;

import com.healthportal.models.Appointment;
import com.healthportal.models.Prescription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class PatientDTO {
    @Data
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public class PatientDto {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String birthDate;
        private String address;
        private String gender;
        private String phone;
        private String password;
        private List<Prescription> medicines = new ArrayList<>();
        private List<Appointment> appointments = new ArrayList<>();
    }
}
