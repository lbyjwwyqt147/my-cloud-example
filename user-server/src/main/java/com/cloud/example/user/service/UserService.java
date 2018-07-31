package com.cloud.example.user.service;

import com.cloud.example.common.restful.RestfulVo;

/***
 * 用户 servcie
 */
public interface UserService {

    /**
     * 根据id 获取用户信息
     * @param id
     * @return
     */
    RestfulVo getUserInfo(String id);

    /**
     * 保存用户信息
     * @param fromJson
     * @return
     */
    RestfulVo saveUserInfo(String fromJson);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    RestfulVo del(String id);
}
