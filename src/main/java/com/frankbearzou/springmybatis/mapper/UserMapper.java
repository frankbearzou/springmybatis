package com.frankbearzou.springmybatis.mapper;

import com.frankbearzou.springmybatis.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User findUserById(int id);
}
