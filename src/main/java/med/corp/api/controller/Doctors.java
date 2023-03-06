package med.corp.api.controller;

import med.corp.api.doctor.DoctorsData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class Doctors {

    @PostMapping
    public void loadDoctors(@RequestBody DoctorsData dados) {
        System.out.println(dados);
    }
}
