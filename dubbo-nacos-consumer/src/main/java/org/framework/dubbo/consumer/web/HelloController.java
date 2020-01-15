package org.framework.dubbo.consumer.web;

import org.apache.dubbo.config.annotation.Reference;
import org.framework.dubbo.common.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twcao
 * @description test
 * @project dubbo-nacos-parent
 * @classname HelloController
 * @date 2020/1/14 17:04
 */
@RestController
public class HelloController {

    /**
     * 避免提供者没有启动导致无法启动的问题
     */
    @Reference(check = false, version = "2.0", owner = "vax")
    HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return helloService.hello(name);
    }
}
