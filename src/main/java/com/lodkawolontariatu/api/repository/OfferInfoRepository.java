package com.lodkawolontariatu.api.repository;

import com.lodkawolontariatu.api.model.OfferInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OfferInfoRepository extends JpaRepository <OfferInfo, Long> {
}
