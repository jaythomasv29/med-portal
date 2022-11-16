package com.healthportal.configuration;

<<<<<<< HEAD
import com.healthportal.dtos.AppointmentDTO;
import com.healthportal.dtos.DoctorDTO;
import com.healthportal.dtos.PatientDTO;
import com.healthportal.dtos.PrescriptionDTO;
import com.healthportal.models.Appointment;
import com.healthportal.models.Doctor;
import com.healthportal.models.Patient;
import com.healthportal.models.Prescription;
import java.util.ArrayList;
import java.util.List;
=======
import com.healthportal.dtos.DoctorDTO;
import com.healthportal.models.Doctor;
>>>>>>> origin/main
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2022-11-15T16:32:48-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
=======
    date = "2022-11-15T16:41:36-0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 19 (Homebrew)"
>>>>>>> origin/main
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public DoctorDTO doctorEntityToDoctorDTO(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();

        doctorDTO.setId( doctor.getId() );
        doctorDTO.setFirstName( doctor.getFirstName() );
        doctorDTO.setLastName( doctor.getLastName() );
        doctorDTO.setDoctor_id( doctor.getDoctor_id() );
<<<<<<< HEAD
        doctorDTO.setEmail( doctor.getEmail() );
        List<Patient> list = doctor.getPatientList();
        if ( list != null ) {
            doctorDTO.setPatientList( new ArrayList<Patient>( list ) );
        }
=======
>>>>>>> origin/main

        return doctorDTO;
    }

    @Override
    public Doctor DoctorDTOToToDoctorEntity(DoctorDTO doctorDTO) {
        if ( doctorDTO == null ) {
            return null;
        }

        Doctor doctor = new Doctor();

        doctor.setId( doctorDTO.getId() );
        doctor.setFirstName( doctorDTO.getFirstName() );
        doctor.setLastName( doctorDTO.getLastName() );
        doctor.setDoctor_id( doctorDTO.getDoctor_id() );
<<<<<<< HEAD
        doctor.setEmail( doctorDTO.getEmail() );
        List<Patient> list = doctorDTO.getPatientList();
        if ( list != null ) {
            doctor.setPatientList( new ArrayList<Patient>( list ) );
        }

        return doctor;
    }

    @Override
    public PatientDTO patientEntityToPatientDTO(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();

        return patientDTO;
    }

    @Override
    public Patient patientDTOToPatientEntity(PatientDTO patientDTO) {
        if ( patientDTO == null ) {
            return null;
        }

        Patient patient = new Patient();

        return patient;
    }

    @Override
    public Prescription prescriptionDTOToPrescriptionEntity(PatientDTO patientDTO) {
        if ( patientDTO == null ) {
            return null;
        }

        Prescription prescription = new Prescription();

        return prescription;
    }

    @Override
    public PrescriptionDTO prescriptionDTOToPrescriptionEntity(Prescription prescription) {
        if ( prescription == null ) {
            return null;
        }

        PrescriptionDTO prescriptionDTO = new PrescriptionDTO();

        return prescriptionDTO;
    }

    @Override
    public AppointmentDTO appointmentEntityToAppointmentEntity(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDTO appointmentDTO = new AppointmentDTO();

        return appointmentDTO;
    }

    @Override
    public Appointment appointmentDTOToAppointmentEntity(AppointmentDTO appointmentDTO) {
        if ( appointmentDTO == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        return appointment;
    }
=======

        return doctor;
    }
>>>>>>> origin/main
}
