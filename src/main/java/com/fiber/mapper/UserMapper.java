package com.fiber.mapper;

import com.fiber.entity.LoginForm;
import com.fiber.entity.UserDetForm;
import com.fiber.entity.UserListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    LoginForm login(String userCode, String userPwd);
    List<UserListForm> userList(@Param("params") UserListForm params);
    List<UserDetForm> selDet(Long userId);
    boolean insertUser(@Param("params") UserDetForm params);
    boolean updateUser(@Param("params") UserDetForm params);
    boolean deleteUser(Long userId);
}
