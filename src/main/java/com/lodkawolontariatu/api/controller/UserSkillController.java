package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.UserSkill;
import com.lodkawolontariatu.api.service.UserInfoService;
import com.lodkawolontariatu.api.service.UserSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class UserSkillController {
    private final UserSkillService userSkillService;
    private final UserInfoService userInfoService;

    @GetMapping(path = "/user-skills/{id}")
    public List<UserSkill> getById(@PathVariable long id) {
        return userSkillService.getById(id);
    }

    @PostMapping(path = "/user-skills/{id}")
    public UserSkill addUserSkill(@RequestBody UserSkill userSkill, @PathVariable long id) {
        var userInfo = userInfoService.getById(id);
        userSkill.setUserId(userInfo);
        return userSkillService.add(userSkill);
    }
}
