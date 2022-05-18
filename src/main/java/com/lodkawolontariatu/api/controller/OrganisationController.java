package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.Organisation;
import com.lodkawolontariatu.api.service.OrganisationService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class OrganisationController {
    private final OrganisationService organisationService;

    @PostMapping(path = "/organizations/add")
    public Organisation addOrganisation(@RequestBody Organisation organisation) {
        return organisationService.add(organisation);
    }
}