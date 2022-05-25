package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.OfferInfo;
import com.lodkawolontariatu.api.service.OfferInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class OfferInfoController {
    private final OfferInfoService offerInfoService;


    @GetMapping(path = "/offers")
    public List<OfferInfo> getOffers() { return offerInfoService.getAllOffers();}

    @PostMapping(path = "/offers/add")
    public ResponseEntity addOffer(@RequestBody OfferInfo offerInfo) {return offerInfoService.addOffer(offerInfo);}

    @DeleteMapping(path = "offers/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {return offerInfoService.deleteOffer(id);}

    @GetMapping(path = "offers/{id}")
    public Optional<OfferInfo> getOffer(@PathVariable Long id) {return offerInfoService.getOffer(id);}

}
