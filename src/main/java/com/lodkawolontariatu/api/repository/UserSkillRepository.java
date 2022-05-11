package com.lodkawolontariatu.api.repository;

import com.lodkawolontariatu.api.model.UserInfo;
import com.lodkawolontariatu.api.model.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSkillRepository extends JpaRepository<UserSkill, Long> {
    List<UserSkill> findByUserId(UserInfo userInfo);
}
