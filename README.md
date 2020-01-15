1、消费者和生成者使用的接口全名必须一样
2、nacos目录nacos\bin
3、因为dubbo目前是apache在维护，故使用apache的dubbo
4、继承nacos配置中心
5、http://127.0.0.1:8848/nacos/index.html nacos/nacos
6、Service注解详解
```$xslt
interfaceName: 全限定接口名成,eg: org.framework.dubbo.common.api.HelloService
version: 版本号, 提供者和消费者必须相同， eg: 2.0
timeout: 调用的超时时间
retries: 重试次数
loadbalance: 负载均衡算法, 默认是随机算法, 还可以配置轮询 roundrobin、最不活跃优先leastactive 和一致性哈希 consistenthash 等
    org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance
    org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance
    org.apache.dubbo.rpc.cluster.loadbalance.LeastActiveLoadBalance
actives: 消费者端的最大并发调用限制，即当 Consumer 对一个服务的并发调用到上限后，新调用会阻塞直到超时，在方法上配置 dubbo:method 则针对该方法进行并发限制
owner: 目前有负责人信息和组织信息用于区分站点。以便于在发现问题时找到服务对应负责人，建议至少配置两个人以便备份, 若没有配置服务层面的负责人，则默认使用 dubbo:application 设置的负责人。
```
7、全局基础配置
```$xslt
dubbo.service.server.port: 服务的监听端口, 服务提供者协议 dubbo.service.protocol
dubbo.service.max.thread.threads.size: 服务线程池大小
alibaba.intl.commons.dubbo.service.allow.no.provider: 消费者启动时，没有提供者是否抛异常

```
