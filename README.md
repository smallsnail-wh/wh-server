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
