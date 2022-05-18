package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.Organisation;
import com.lodkawolontariatu.api.repository.OrganisationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganisationService {

    private final OrganisationRepository organisationRepository;

    public Organisation add(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

}
