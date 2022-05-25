package com.lodkawolontariatu.api.service;


import com.lodkawolontariatu.api.model.OfferInfo;
import com.lodkawolontariatu.api.repository.OfferInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfferInfoService {
    private final OfferInfoRepository offerInfoRepository;

    public List<OfferInfo> getAllOffers() {return offerInfoRepository.findAll();}

    public ResponseEntity deleteOffer(@PathVariable Long id) {
       Optional<OfferInfo> offerInfos = offerInfoRepository.findById(id);

       if(!offerInfos.isPresent())
           return new ResponseEntity("Offer doesn't exist", HttpStatus.NOT_FOUND);

        offerInfoRepository.deleteById(id);
        return new ResponseEntity("Deleted successfully", HttpStatus.OK);
    }

    public Optional<OfferInfo> getOffer(Long id) {
        Optional<OfferInfo> offerInfo = offerInfoRepository.findById(id);
        if(offerInfo.isEmpty())
            return Optional.empty();
        else
            return offerInfo;
    }

    public ResponseEntity addOffer(OfferInfo offerInfo) {
        offerInfoRepository.save(offerInfo);
        return new ResponseEntity<>("Offer added.", HttpStatus.OK);
    }
}
