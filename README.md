# 听多多项目  

## 项目结构    
```
tingduoduo  
|——cloud
|    |——eureka -- 服务注册中心
|
|——mall 
|
|—— oauth-client -- 认证客户端
|
|—— oauth-server -- 认证服务器

```

## 项目介绍  
**eureka：服务注册中心**  
> http://localhost:1025/eureka-server/  

**com.rb.oauth.config-server：配置服务器**  
> http://localhost:8763/  

**com.rb.oauth-server：认证服务器**  
> http://localhost:1002  

**com.rb.oauth-client: 认证客户端**
> http://localhost:1003  
> 访问该地址会自动跳转到认证服务器进行授权登录，登录成功后跳转至index.html页面。


