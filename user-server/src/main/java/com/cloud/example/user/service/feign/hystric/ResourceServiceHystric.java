package com.cloud.example.user.service.feign.hystric;

import com.cloud.example.common.restful.RestfulVo;
import com.cloud.example.common.restful.ResultUtil;
import com.cloud.example.user.service.feign.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/***
 *  ResourceService 的熔断器
 */
@Slf4j
@Component
public class ResourceServiceHystric implements ResourceService {
    @Override
    public RestfulVo getResource(String userId) {
        log.info("触发熔断机制 ..................... ");
        return ResultUtil.fail("调用 resource-server 服务接口失败.");
    }
}
