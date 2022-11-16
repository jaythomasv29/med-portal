package com.healthportal.configuration;

import com.healthportal.dtos.DoctorDTO;
import com.healthportal.models.Doctor;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-15T16:41:36-0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 19 (Homebrew)"
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

        return doctor;
    }
}
