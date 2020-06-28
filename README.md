### 介绍
xm-mall是基于springboot搭建的网上商城，响应式

前端技术：html、css、js、jq、bootstrap
后台技术：springboot、thymeleaf、mybatis、mysql、lombok
&nbsp;

按登录角色分为用户、管理员，用户模块可细分为商品操作、订单操作，功能如下
- 根据关键字检索商品，查看商品详细信息
- 添加商品至购物车，对购物车中的商品进行结算、支付
- 查看订单状态，订单状态包括已付款、已出库、已发货、已收货
- 确认收货，完成交易
&nbsp;

管理员模块可细分为商品操作、订单操作、商城设置、用户操作4个部分，功能如下
- 添加、修改商品
- 查看、修改订单，可将订单状态修改为已出库、已发货。
- 设置商城首页的轮播图、推荐商品
- 封禁、解封用户账号

&nbsp;

### 使用
- 新建数据库 db_xm_mall，运行sql脚本
- 修改application.properties中的数据库配置
- 修改common包下Constants类中的upload文件夹路径
- 项目使用了lombok，IDEA需安装lombok插件

运行，访问 127.0.0.1:9502 ，后台地址 127.0.0.1:9502/admin

使用手机号作为登录账号，用户、管理员的账号都是：18883701161
密码都是：abcd1234

&nbsp;

### 前台效果图
首页：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628185544387.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628185435527.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)

&nbsp;

注册、登录页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628185832664.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

个人信息页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190132112.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

查看个人订单页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190237977.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

订单详情页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190322617.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

商品检索结果页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190432845.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

商品详情页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190505832.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

购物车页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190540315.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

结算页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628190640548.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

支付方式选择页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628191151497.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

付款页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628191756553.PNG?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628191809379.PNG?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
留了一个付款成功的按钮，模拟支付成功

&nbsp;

### 后台效果图
登录页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192355737.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

添加、修改商品信息页面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192450301.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

首页轮播图、热销商品设置：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192537264.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020062819261957.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

商品分类管理：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192658922.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

商品管理：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192734942.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

用户管理：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192802431.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

订单管理：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192838108.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
&nbsp;

管理员信息设置：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200628192917638.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NoeV8xODg4MzcwMTE2MQ==,size_16,color_FFFFFF,t_70)
