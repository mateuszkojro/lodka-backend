package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.UserInfo;
import com.lodkawolontariatu.api.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    public UserInfo add(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    public final UserInfo getById(Long id) {
        return userInfoRepository.findById(id).orElseThrow();
    }
}
