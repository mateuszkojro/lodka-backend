package com.lodkawolontariatu.api.repository;

import com.lodkawolontariatu.api.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation,Long> {
    void deleteById(Long id);
}
