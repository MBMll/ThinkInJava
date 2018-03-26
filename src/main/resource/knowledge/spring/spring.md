#### Spring特征
##### 轻量
##### 非侵入式
> Spring应用中的对象不依赖于Spring的特定类,业务逻辑和架构分开
##### 控制反转
##### 面向切面
##### 容器
> Spring包含并管理应用对象的配置和生命周期，在这个意义上它是一种容器，你可以配置你的每个bean如何被创建——基于一个可配置原型（prototype），你的bean可以创建一个单独的实例或者每次需要时都生成一个新的实例——以及它们是如何相互关联的
##### 框架整合
> 简单的组件配置、组合成为复杂的应用
##### 好处
> 更干净、更规范、更易于测试维护的代码
#### IOC
##### 定义 : 
> Inversion of Control，即“控制反转”，不是什么技术，而是一种设计思想. 
> 将你设计好的对象交给容器控制，而不是传统的在你的对象内部直接控制
##### 解释 : 
> 当然是IoC 容器控制了对象；控制什么？那就是主要控制了外部资源获取（不只是对象包括比如文件等）
> 因为由容器帮我们查找及注入依赖对象，对象只是被动的接受依赖对象，所以是反转；
> 哪些方面反转了？ 依赖对象的获取被反转了
##### 功能:
> IoC很好的体现了面向对象设计法则之一—— 好莱坞法则：“别找我们，我们找你”；
> 即由IoC容器帮对象找相应的依赖对象并注入，而不是由对象主动去找
#### DI(依赖注入)
> IoC的一个重点是在系统运行中，动态的向某个对象提供它所需要的其他对象。这一点是通过DI（Dependency Injection，依赖注入）来实现的
#### AOP(面向切面编程)
> 面向切面编程的目标就是分离关注点
#### spring启动流程
>1. ServletContext
>2. ContextLoaderListener.contextInitialized()
>3. WebApplicationContext XmlWebApplicationContext ->WebApplicationContext.ROOTWEBAPPLICATIONCONTEXTATTRIBUTE
