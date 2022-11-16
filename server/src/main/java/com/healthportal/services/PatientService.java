package com.healthportal.services;

import com.healthportal.dtos.PatientDto;
import com.healthportal.models.Patient;

import javax.transaction.Transactional;
import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    @Transactional
    Patient savePatient(PatientDto patientDto);
}
