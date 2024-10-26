package com.idcmis.service;

import com.github.pagehelper.PageInfo;
import com.idcmis.entity.*;

import java.util.List;

public interface UserService {
    /**
     * 登陆
     * @return
     */
    LoginVo login(LoginForm params);
    /**
     * 人员信息列表
     * @return
     */
    PageInfo<UserListVo> userList(UserListForm params);
    /**
     * 人员信息详细
     * @return
     */
    List<UserDetVo> userDet(Long userId);
}
