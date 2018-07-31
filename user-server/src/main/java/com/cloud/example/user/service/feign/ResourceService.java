package com.cloud.example.user.service.feign;

import com.cloud.example.common.restful.RestfulVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * 调用  resource-service 服务的接口
 */

public interface ResourceService {

     @GetMapping("v1/resource/user")
     RestfulVo getResource(@RequestParam("userId") String userId);
}
