package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.Organisation;
import com.lodkawolontariatu.api.service.OrganisationService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class OrganisationController {
    private final OrganisationService organisationService;

    @PostMapping(path = "/organizations/add")
    public Organisation addOrganisation(@RequestBody Organisation organisation) {
        return organisationService.add(organisation);
    }

    @DeleteMapping(path = "/organizations/delete/{id}")
    public Optional<Organisation> addOrganisation(@PathVariable long id) {
        return organisationService.delete(id);
    }

    @GetMapping(path = "/organization/{id}")
    public Organisation getById(@PathVariable long id){
        return organisationService.getById(id);
    }

    @GetMapping(path = "/organizations")
    public List<Organisation> getOrganisations(){
        return organisationService.getOrganisations();
    }
}
