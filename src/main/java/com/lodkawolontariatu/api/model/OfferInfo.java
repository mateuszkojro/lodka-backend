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
    private Long organization_id;
    private Long avaiable_positions;
    private Long taken_positions;
    private String start_date;
    private String end_date;
    private String description;
    private String visibility;
    private String offer_status;

}
