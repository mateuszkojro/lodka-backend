package com.lodkawolontariatu.api.repository;

import com.lodkawolontariatu.api.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
