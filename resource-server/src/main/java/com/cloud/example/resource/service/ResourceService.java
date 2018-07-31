package com.cloud.example.resource.service;

import com.cloud.example.common.restful.RestfulVo;

/***
 * 资源 service
 */
public interface ResourceService {

    /**
     * 获取用户资源
     * @param userId
     * @return
     */
    RestfulVo getResourceInfo(String userId);

}
