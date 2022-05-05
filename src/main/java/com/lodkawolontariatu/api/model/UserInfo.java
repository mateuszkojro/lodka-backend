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
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String name;
    private String surname;
    private String email; //TODO: typ email
    private String phone_number;

    @Enumerated(EnumType.STRING)
    private UserStatusT user_status;

    private String photo_url;
}

