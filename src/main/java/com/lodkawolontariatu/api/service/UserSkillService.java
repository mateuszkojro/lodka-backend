package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.UserSkill;
import com.lodkawolontariatu.api.repository.UserSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSkillService {
    private final UserSkillRepository userSkillRepository;

    public UserSkill add(UserSkill userSkill) {
        return userSkillRepository.save(userSkill);
    }

    public UserSkill getById(Long id) {
        return userSkillRepository.findById(id).orElseThrow();
    }

}
