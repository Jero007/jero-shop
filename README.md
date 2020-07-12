### 目录

#### 01
不使用springcloud，消费者 直连 提供者。

#### 02
使用springcloud 的eureka组件，实现服务注册与发现。
消费者调用提供者的方式为：RestTemplate+Ribbon

#### 03
使用feign，替换02中的 RestTemplate+Ribbon 调用方式

#### 04 
增加Hystrix组件，实现服务熔断。

#### 05 
建立eureka集群