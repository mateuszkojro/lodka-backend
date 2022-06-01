package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.VolunteerInfo;
import com.lodkawolontariatu.api.service.VolunteerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class VolunteerController {

    private final VolunteerService volunteerService;

    @PostMapping(path = "/volunteer/")
    public VolunteerInfo addVolunteer(@RequestBody VolunteerInfo volunteer) {
        return volunteerService.add(volunteer);
    }

    @GetMapping(path = "/volunteer/")
    public List<VolunteerInfo> getAll() {
        return volunteerService.findAll();
    }


    @GetMapping(path = "/volunteer/{id}")
    public VolunteerInfo getById(@RequestBody Long id) {
        return volunteerService.get(id);
    }

    @DeleteMapping(path = "/volunteer/{id}")
    public Optional<VolunteerInfo> deleteVolunteer(@PathVariable Long id) {
        return volunteerService.delete(id);
    }

}
