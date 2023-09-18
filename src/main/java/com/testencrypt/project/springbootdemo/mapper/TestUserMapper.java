package com.testencrypt.project.springbootdemo.mapper;

import com.testencrypt.project.springbootdemo.bean.TestUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestUserMapper{


    @Insert("insert into test_user(name,password,phone) values(#{name},#{password},#{phone})")
    Integer addTest(TestUser testUser);

    @Select("select * from test_user where password like CONCAT('%',#{password},'%')")
    List<TestUser> getAllData(@Param("password") String password);
}
