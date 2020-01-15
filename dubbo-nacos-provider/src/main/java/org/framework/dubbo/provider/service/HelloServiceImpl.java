package org.framework.dubbo.provider.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.apache.dubbo.config.annotation.Service;
import org.framework.dubbo.common.api.HelloService;

/**
 * @author twcao
 * @description test
 * @project dubbo-nacos-parent
 * @classname HelloServiceImpl
 * @date 2020/1/14 17:01
 */
@Service(version = "2.0", timeout = 5000, interfaceName = "org.framework.dubbo.common.api.HelloService", owner = "vax")
public class HelloServiceImpl implements HelloService {

    @NacosValue(value = "${custom.property}", autoRefreshed = true)
    String packages;
    
    @Override
    public String hello(String name) {
        return "hello " + packages;
    }
}
