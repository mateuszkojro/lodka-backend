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
    @JoinColumn(name = "user_id")
    @Id
    Long volunteerId;
    private String name;
    Date birthdate;
    private String email;
    private String adress;
    private String user_evaluation;
    private Boolean account_verified;
    private Boolean paren_approved;

}
