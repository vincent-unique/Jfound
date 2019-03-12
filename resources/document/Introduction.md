##Java 业务系统常规编码手段
```$xslt
1、规则与流程引擎：drools、activiti
https://blog.csdn.net/mn960mn/article/details/47803297
2、并发与异步：reactor、lmax disruptor, Vert.x
3、原子逻辑可重试：支持业务幂等 + Retry 机制【spring Retry】
4、订单 OR 线性状态管理 ：有限状态机FSM + 事件
5、好用的pulgin、library： lombok
6、任务流 LTS 
https://qq254963746.gitbooks.io/lts/content/introduce/architecture.html
7、配置：
本地：typesafe config
https://dzone.com/articles/typesafe-config-features-and-example-usage
https://www.stubbornjava.com/tags/Configuration/posts
中心化配置平台：apollo
https://github.com/ctripcorp/apollo
```