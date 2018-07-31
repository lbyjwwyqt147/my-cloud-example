package com.cloud.example.resource.service.impl;

import com.cloud.example.common.restful.RestfulVo;
import com.cloud.example.common.restful.ResultUtil;
import com.cloud.example.resource.dto.ResourceDto;
import com.cloud.example.resource.service.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/***
 * 资源 serviceImpl
 */
@Slf4j
@Service
public class ResourceServiceImpl implements ResourceService {
    @Override
    public RestfulVo getResourceInfo(String userId) {
        ResourceDto resourceDto = new ResourceDto();
        resourceDto.setId("1");
        resourceDto.setResourceName("用户管理");
        resourceDto.setUrl("http://baidu.com");
        resourceDto.setUserId(userId);
        return ResultUtil.success(resourceDto);
    }
}
