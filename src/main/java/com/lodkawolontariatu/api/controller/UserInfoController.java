package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserInfoController {

    private final UserInfoService userInfoService;
}
