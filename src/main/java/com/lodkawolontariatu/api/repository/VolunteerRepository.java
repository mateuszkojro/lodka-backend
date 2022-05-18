package com.lodkawolontariatu.api.repository;

import com.lodkawolontariatu.api.model.VolunteerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerRepository extends JpaRepository<VolunteerInfo, Long> {
}