package com.healthportal.controllers;

import com.healthportal.dtos.AppointmentDTO;
import com.healthportal.dtos.PatientDTO;
import com.healthportal.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/patient/{patientId}")
    public List<PatientDTO> getAppointmentByPatient(@PathVariable Long patientId){
        return appointmentService.getAllAppointmentsByPatientId(patientId);
    }

    @GetMapping("/doctor/{doctorId}")
    public List<AppointmentDTO> getAppointmentByDoctor(@PathVariable Long doctorId){
        return appointmentService.getAllAppointmentsByDoctorId(doctorId);
    }

 // TO UPDATE LATER
//    @GetMapping("/{appointmentId}")
//    public Optional<AppointmentDTO> getAppointmentById(@PathVariable Long TBDId){
//        return appointmenService.getRequestById(TBDId);
//    }

    @PostMapping("/patient/{patientId}")
    public void addAppointment(@RequestBody AppointmentDTO appointmentDto,@PathVariable Long patientId) {
        appointmentService.addAppointment(appointmentDto, patientId);
    }

    @DeleteMapping("/{appointmentId}")
    public void deleteAppointmentById(@PathVariable Long requestId){ appointmentService.deleteAppointmentById(appointmentId);
    }

    @PutMapping("/{appointmentId}")
    public void changeStatusAppointmentById(@PathVariable Long appointmentId){
        appointmentService.changeStatusAppointmentById(appointmentId);
    }

    @PutMapping
    public void updateAppointment(@RequestBody AppointmentDTO requestDto){ appointmentService.updateAppointmentById(appointmentDto);
    }
}
