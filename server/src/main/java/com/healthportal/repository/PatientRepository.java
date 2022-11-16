package com.healthportal.repository;

import com.healthportal.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
=======
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}

>>>>>>> origin/main
