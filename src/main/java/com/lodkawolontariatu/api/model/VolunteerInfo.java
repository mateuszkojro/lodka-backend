package com.lodkawolontariatu.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VOLUNTEER_INFO")
public class VolunteerInfo {
    // TODO: This is a foregin?
    @OneToOne
    @JoinColumn(name = "userId")
    @Id
    UserInfo volunteerId;
    private String name;
    private String surname;
    Date birthdate;
    Date registrationDate;
    String phoneNumber;
    private String email;
    private String address;
    private Boolean account_verified;
    private Boolean paren_approved;
    String photoUrl;
    String status;
}

