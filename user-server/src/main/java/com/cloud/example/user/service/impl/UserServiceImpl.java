package com.cloud.example.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.cloud.example.common.restful.RestfulVo;
import com.cloud.example.common.restful.ResultUtil;
import com.cloud.example.user.dto.UserDto;
import com.cloud.example.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.cloud.example.user.service.UserService;

/***
 *  用户信息 serviceImpl
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public RestfulVo getUserInfo(String id) {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setAddress("苦境");
        userDto.setName("默苍离");
        userDto.setPhone("110");
        return ResultUtil.success(userDto);
    }

    @Override
    public RestfulVo saveUserInfo(String fromJson) {
        try {
            log.info("开始保存用户信息.......");
            log.info(fromJson);
            UserDto userDto = JSON.parseObject(fromJson,UserDto.class);
            return ResultUtil.success();
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.fail();
        }
    }

    @Override
    public RestfulVo del(String id) {
        log.info("需要删除的 user id ： " + id);
        return ResultUtil.success();
    }
}
