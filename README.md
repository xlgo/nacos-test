# nacos-test

`platform-test.properties`
```properties
test=1002
dyn.token=2002
```
访问 [服务](http://localhost:8080/test/hi) 页面 ,修改配置项，页面值没有刷新


good 分支已经解决了，最小引用，因为不支持bootstrap的方式了，并且**必须**要把`spring-cloud-starter-bootstrap`移除掉
