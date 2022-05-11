package com.lodkawolontariatu.api.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_SKILL")
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userSkillId;

    // TODO: This is a foregin
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfo userId;

    private String skill;
}
