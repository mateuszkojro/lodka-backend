package com.lodkawolontariatu.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ORGANISATION_INFO")
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String organisationName;
    private String address;

    private String remarks;
    @Enumerated(EnumType.STRING)
    private OrganisationType organisationType;
    @Enumerated(EnumType.STRING)
    private OrganisationStatus organisationStatus;
}
