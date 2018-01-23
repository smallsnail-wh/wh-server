# wh-server

项目介绍
--
spring boot项目,与我的另外一个前端项目[wh-web](https://github.com/smallsnail-wh/wh-web)搭配（前后端分离）。

项目展示
--
地址：https://smallsnail-wh.github.io
用户名：admin
密码：admin
（第一次打开可能会有点慢）

技术栈
--
 - spring boot
 - mybatis
 - Spring Security OAuth2

接口设计：
-----
	RESTful

认证与授权：
------
	使用了Spring Security OAuth2

数据库：
----
使用mysql。（表与表数据在wh-server\src\main\resources\createTable中,用户密码为md5加密，admin密码为admin）

注：
--
 1. 此后端是授权服务和资源服务在一个项目中，建议将授权服务和资源服务分离成2个项目。
 2. 此后端的用户token信息是存储在内存中，建议将其存储在redis中。
 3. 客户的详细资料是我手动在MyAuthorizationServerConfigurerAdapter中配置的，建议使用数据库配置。
 4. 如果你想采用上述建议，但是无从下手，请在我的github中留言。
