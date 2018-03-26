# springMVC  
###### *Create By xlc 2018/3/23 12:58*  

#### 流程
>1. DispatcherServlet前端控制器接收发过来的请求，交给HandlerMapping处理器映射器
>2. HandlerMapping处理器映射器，根据请求路径找到相应的HandlerAdapter处理器适配器（处理器适配器就是那些拦截器或Controller）
>3. HandlerAdapter处理器适配器，处理一些功能请求，返回一个ModelAndView对象（包括模型数据、逻辑视图名）
>4. ViewResolver视图解析器，先根据ModelAndView中设置的View解析具体视图
>5. 然后再将Model模型中的数据渲染到View上

