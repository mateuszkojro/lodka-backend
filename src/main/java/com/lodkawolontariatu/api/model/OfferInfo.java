package com.lodkawolontariatu.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="OFFER_INFO")

public class OfferInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long organizationId;
    private Long avaiablePositions;
    private Long takenPositions;
    private String startDate;
    private String endDate;
    private String description;
    private String visibility;
    private String offerStatus;

}
