# servlet  
###### *Create By Administrator 2018/3/27 23:11*  

#### Servlet的概念
Servlet是基于Java技术的Web组件，由容器管理并产生动态的内容。Servlet引擎作为WEB服务器的扩展提供支持Servlet的功能

#### Servlet生命周期
>1. 装载Servlet，这一项操作一般是动态执行的。然而，Servlet通常会提供一个管理的选项，用于在Servlet启动时强制装载和初始化特定的Servlet
>2. Server创建一个Servlet实例
>3. Server调用Servlet的init方法
>4. 一个客户端请求到达Server
>5. Server创建一个请求对象
>6. Server创建一个响应对象
>7. Server激活Servlet的service方法，传递请求和响应对象作为参数
>8. service方法获得关于请求对象的信息，处理请求，访问其他资源，获得需要的信息
>9. service方法使用响应对象的方法。将响应传回Server，最终到达客户端。Service方法可能激活其他方法以处理请求。如doGet，doPost或其他程序员自己开发的方法
>10. 对于更多的客户端请求，Server创建新的请求和响应对象，仍然激活此servlet的service方法，将这两个对象作为参数传递给它，如此重复以上的循环，但无需再次调用init方法，Servlet一般只初始化一次
>11. 当Server不再需要Servlet时，比如当Server要关闭时，Server调用Servlet的destroy

#### Servlet和jsp
>- JSP的本质就是Servlet，JVM只能识别java的类，不能识别JSP的代码,Web容器将JSP的代码编译成JVM能够识别的java类。
>- JSP侧重于视图，Servlet主要用于控制逻辑。
