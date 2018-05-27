## JDK6 新特性
### Desktop 类和 SystemTray 类 
在JDK6中 ,AWT新增加了两个类：Desktop和SystemTray。

### 使用 JAXB2 来实现对象与 XML 之间的映射 
JAXB是Java Architecture for XML Binding的缩写，可以将一个Java对象转变成为XML格式，反之亦然。

### 理解StAX 
StAX(JSR 173)是JDK6.0中除了DOM和SAX之外的又一种处理XML文档的API。

### 使用Compiler API 
现在我 们可以用JDK6 的Compiler API(JSR 199)去动态编译Java源文件，Compiler API结合反射功能就可以实现动态的产生Java代码并编译执行这些代码，有点动态语言的特征。

### 轻量级Http Server API 
JDK6 提供了一个简单的Http Server API,据此我们可以构建自己的嵌入式Http Server,它支持Http和Https协议,提供了HTTP1.1的部分实现，没有被实现的那部分可以通过扩展已有的Http Server API来实现,程序员必须自己实现HttpHandler接口,HttpServer会调用HttpHandler实现类的回调方法来处理客户端请求,在 这里,我们把一个Http请求和它的响应称为一个交换,包装成HttpExchange类,HttpServer负责将HttpExchange传给 HttpHandler实现类的回调方法.

### 插入式注解处理API 
插入式注解处理API(JSR 269)提供一套标准API来处理Annotations(JSR 175)

### 用Console开发控制台程序 
JDK6 中提供了java.io.Console 类专用来访问基于字符的控制台设备。

### 对脚本语言的支持 
如: ruby, groovy, javascript
