package com.healthportal.configuration;

import com.healthportal.dtos.AppointmentDTO;
import com.healthportal.dtos.DoctorDTO;
import com.healthportal.dtos.PatientDTO;
import com.healthportal.dtos.PrescriptionDTO;
import com.healthportal.models.Appointment;
import com.healthportal.models.Doctor;
import com.healthportal.models.Patient;
import com.healthportal.models.Prescription;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;



@Mapper(componentModel = "spring")
@Component
public interface MapStructMapper {

    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

    DoctorDTO doctorEntityToDoctorDTO(Doctor doctor);
    Doctor DoctorDTOToToDoctorEntity(DoctorDTO doctorDTO);

    PatientDTO patientEntityToPatientDTO(Patient patient);
    Patient patientDTOToPatientEntity(PatientDTO patientDTO);

    Prescription prescriptionDTOToPrescriptionEntity(PatientDTO patientDTO);
    PrescriptionDTO prescriptionDTOToPrescriptionEntity(Prescription prescription);

    AppointmentDTO appointmentEntityToAppointmentEntity(Appointment appointment);
    Appointment appointmentDTOToAppointmentEntity(AppointmentDTO appointmentDTO);

}