package com.cloud.example.resource.controller;

import com.cloud.example.common.restful.RestfulVo;
import com.cloud.example.resource.service.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 资源 controller
 */
@Slf4j
@RestController
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("v1/resource/user")
    public RestfulVo getResourceByV1(String userId){
        log.info("调用 v1 版本 的 get 接口 ...............");
        return resourceService.getResourceInfo(userId);
    }

    @GetMapping("v2/resource/user")
    public RestfulVo getResourceByV2(String userId){
        log.info("调用 v2 版本 的 get 接口 ...............");
        return resourceService.getResourceInfo(userId);
    }
}
