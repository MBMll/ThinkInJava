# Struts2  
###### *Create By Administrator 2018/3/27 23:53*  

#### 流程

>- 客户端初始化一个指向Servlet容器（例如Tomcat）的请求
>- 这个请求经过一系列的过滤器（Filter）（这些过滤器中有一个叫做ActionContextCleanUp的可选过滤器，这个过滤器对于Struts2和其他框架的集成很有帮助，例如：SiteMesh Plugin）；
>- 接着StrutsPrepareAndExecuteFilter被调用，StrutsPrepareAndExecuteFilter询问ActionMapper来决定这个请求是否需要调用某个Action；
>- 如果ActionMapper决定需要调用某个Action，StrutsPrepareAndExecuteFilter把请求的处理交给ActionProxy；
>- ActionProxy通过ConfigurationManager询问框架的配置文件，找到需要调用的Action类；
>- ActionProxy创建一个ActionInvocation的实例。
>- ActionInvocation实例使用命名模式来调用，在调用Action的过程前后，涉及到相关拦截器（Intercepter）的调用。
>- 一旦Action执行完毕，ActionInvocation负责根据struts.xml中的配置找到对应的返回结果。

#### struts和springmvc区别

>- Struts2是一个请求一个Action,SpringMVC是单例模式的
>- Struts2是基于类的横切，SpringMVC基于方法（可以和上条结合起来思考）粒度更细
>- 一个入口是Filter，一个入口是Servlet。则两者个方面机制不同，比如拦截器实现机制
>- SpringMVC开发速度和性能较优于Struts2，流程更容易理解
>- Spring体系更加强大和活跃