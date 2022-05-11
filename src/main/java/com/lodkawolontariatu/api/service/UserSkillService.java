package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.UserInfo;
import com.lodkawolontariatu.api.model.UserSkill;
import com.lodkawolontariatu.api.repository.UserSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSkillService {
    private final UserSkillRepository userSkillRepository;

    public UserSkill add(UserSkill userSkill) {
        return userSkillRepository.save(userSkill);
    }

    public List<UserSkill> getById(Long id) {
        var userInfo = new UserInfo();
        userInfo.setUserId(id);
        return userSkillRepository.findByUserId(userInfo);
    }

}
