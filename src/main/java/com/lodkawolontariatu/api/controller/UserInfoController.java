package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.UserInfo;
import com.lodkawolontariatu.api.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class UserInfoController {
    private final UserInfoService userInfoService;

    @GetMapping(path = "/user-info/get/{id}")
    public UserInfo getById(@PathVariable Long id) {
        return userInfoService.getById(id);
    }

    @PostMapping(path = "/user-info/post")
    public UserInfo addUser(@RequestBody UserInfo userInfo) {
        return userInfoService.add(userInfo);
    }
}
