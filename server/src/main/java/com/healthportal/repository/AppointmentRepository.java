package com.healthportal.repository;

import com.healthportal.models.Appointment;
import com.healthportal.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
