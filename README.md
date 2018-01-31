# wh-server

## 项目版本升级1.0.1

1. spring boot 2.0.0.M5 --> spring boot 2.0.0.M7
2. spring security 4 --> spring security 5
3. 用户token信息，从内存存储变为redis存储
4. 客户的详细资料由手动在MyAuthorizationServerConfigurerAdapter中配置的，改为使用数据库配置（添加了oauth_client_details表）
5. 用户密码加密由md5加密改为BCrypt加密
6. 打包方式由jar改为war（可根据自己需要更改）


## 项目介绍

spring boot项目,与我的另外一个前端项目[wh-web](https://github.com/smallsnail-wh/wh-web)搭配（前后端分离）。

## 项目展示

地址：https://smallsnail-wh.github.io
用户名：admin
密码：admin
（第一次打开可能会有点慢）

## 技术栈

 - spring boot
 - mybatis
 - Spring Security OAuth2

## 接口设计：

	RESTful

## 认证与授权：

	使用了Spring Security OAuth2

## 数据库：

使用mysql。（表与表数据在wh-server\src\main\resources\createTable中,用户密码为BCrypt加密，用户admin的密码为admin）

## 注：

 1. 此后端是授权服务和资源服务在一个项目中，建议将授权服务和资源服务分离成2个项目。
 2. 如果你想采用上述建议，但是无从下手，请在我的github中留言。
