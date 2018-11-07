##Java 业务系统常规编码手段
```$xslt
1、规则与流程引擎：drools、activiti
2、并发与异步：reactor、lmax disruptor, Vert.x
3、原子逻辑可重试：支持业务幂等 + Retry 机制【spring Retry】
4、订单 OR 线性状态管理 ：有限状态机FSM + 事件
5、好用的pulgin、library： lombok
```