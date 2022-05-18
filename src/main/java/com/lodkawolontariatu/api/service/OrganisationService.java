package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.Organisation;
import com.lodkawolontariatu.api.repository.OrganisationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrganisationService {

    private final OrganisationRepository organisationRepository;

    public Organisation add(Organisation organisation) {
        return organisationRepository.save(organisation);
    }
    public Optional<Organisation> delete(Long id) {
        var maybeOrganisation = organisationRepository.findById(id);
        if (maybeOrganisation.isPresent()) {
            organisationRepository.deleteById(id);
        }
        return maybeOrganisation;
    }

    public final Organisation getById(Long id){
        return organisationRepository.findById(id).orElseThrow();
    }

    public final List<Organisation> getOrganisations(){
        return organisationRepository.findAll();
    }

}
