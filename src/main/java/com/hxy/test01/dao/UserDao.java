package com.hxy.test01.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxy.test01.domain.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
