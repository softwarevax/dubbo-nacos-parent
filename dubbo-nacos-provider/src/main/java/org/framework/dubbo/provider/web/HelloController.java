package org.framework.dubbo.provider.web;

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
 * @date 2020/1/14 18:03
 */
@RestController
public class HelloController {

    @Reference(check = false, version = "2.0", owner = "vax")
    HelloService helloService;

    @GetMapping("/hello/{name}")
    public String test(@PathVariable String name) {
        return helloService.hello(name);
    }
}
