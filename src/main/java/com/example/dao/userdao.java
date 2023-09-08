package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface userdao extends Mapper<User> {
}
