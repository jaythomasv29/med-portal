package com.healthportal.configuration;

import com.healthportal.dtos.DoctorDTO;
import com.healthportal.models.Doctor;
import com.healthportal.models.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-15T14:51:11-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
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
        List<Patient> list = doctor.getPatientList();
        if ( list != null ) {
            doctorDTO.setPatientList( new ArrayList<Patient>( list ) );
        }

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
        List<Patient> list = doctorDTO.getPatientList();
        if ( list != null ) {
            doctor.setPatientList( new ArrayList<Patient>( list ) );
        }

        return doctor;
    }
}
