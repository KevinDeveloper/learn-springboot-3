package com.kevin.lessontwo.testRedis.JPA;

import com.kevin.lessontwo.testRedis.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedisUserJPA extends JpaRepository<UserEntity, Long>{
}
