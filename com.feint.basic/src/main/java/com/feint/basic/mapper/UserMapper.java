package com.feint.basic.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by feint on 16/9/8.
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(name, age) values(#{name},#{age})")
    void addUser(@Param("name") String name,@Param("age") int age);
}
