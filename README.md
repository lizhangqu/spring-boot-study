### 运行

起一个终端，执行命令，守护进程
```
gradle :moduleName:bootRun
```

热部署，修改代码后，执行命令，构建class，构建完成后即时生效

```
gradle :moduleName:build
```


### Debug

看到控制台输出
Listening for transport dt_socket at address: 5005

New Configuration->Remote->填写Name(这里填debug)，host，port->OK

运行debug configuration，打断点

