package com.healthportal.service;

import com.healthportal.dtos.PatientDto;
import com.healthportal.models.Patient;
import com.healthportal.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    @Transactional
    public Patient savePatient(PatientDto patientDto) {
        return patientRepository.save(new Patient(patientDto));
    }
}