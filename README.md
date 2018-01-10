# wh-server

项目介绍
--
	spring boot项目,与我的另外一个前端项目wh-web搭配（前后端分离）https://github.com/smallsnail-wh/wh-web。

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
