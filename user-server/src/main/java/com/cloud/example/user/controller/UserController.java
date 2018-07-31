package com.cloud.example.user.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.example.common.restful.RestfulVo;
import com.cloud.example.user.service.UserService;
import com.cloud.example.user.service.feign.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 *  用户 controller
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ResourceService resourceService;

    @GetMapping("/v1/user/info")
    public RestfulVo getUserInfoByV1(String id){

        log.info("调用v1 版本 get 接口 .............. ");
        RestfulVo restfulVo  = resourceService.getResource(id);
        log.info("用户拥有的资源信息: " + JSON.toJSONString(restfulVo));
        return userService.getUserInfo(id);
    }


    @GetMapping("/v2/user/info")
    public RestfulVo getUserInfoByV2(String id){

        log.info("调用v2 版本 get 接口 .............. ");
        return userService.getUserInfo(id);
    }

    @PostMapping("/v1/user/save")
    public RestfulVo saveUserInfoByV1(String from){

        log.info("调用v1 版本 save 接口 .............. ");

        return userService.saveUserInfo(from);
    }


    @PostMapping("/v2/user/save")
    public RestfulVo saveUserInfoByV2(String from){

        log.info("调用v2 版本 save 接口 .............. ");
        return userService.saveUserInfo(from);
    }


    @DeleteMapping("/v1/user/del")
    public RestfulVo delByV1(String id){

        log.info("调用v1 版本 del 接口 .............. ");

        return userService.del(id);
    }


    @DeleteMapping("/v2/user/del")
    public RestfulVo delByV2(String id){

        log.info("调用v2 版本 del 接口 .............. ");
        return userService.del(id);
    }
}
