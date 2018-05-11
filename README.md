# MySSM
从零开始，图文详解。整合SSM框架：spring+springmvc+mybatis

# 注意
代码中有一个地方写错了，在 `spring-service.xml` 文件中扫描只是 `service` 包，扫描不到 `controller` ，所以需要改成 如下
```
    <context:component-scan base-package="ssm.*" />
```
