# mybatis  
###### *Create By Administrator 2018/3/28 0:18*  

#### 简介
mybatis是一个优秀的持久层框架，他对jdbc操作数据库的过程进行了封装，使开发着只用关注sql本身

#### 原理
mybatis通过配置文件创建sqlsessionFactory，sqlsessionFactory根据配置文件，获取sqlSession.

配置文件来源于两个方面:一个是xml，一个是Java中的注解

#### 优势

>1. 使用数据库连接池管理链接，避免了频繁创建了、关闭链接，浪费资源，影响性能的问题。
>2. 用xml管理sql语句，让Java代码和sql语句分离，使得代码更易维护。
>3. 解决了sql语句参数不定的问题。xml中可以通过where条件决定sql语句的条件参数。mybatis将Java对象映射到sql语句，通过statement的parameterType定义输入参数的类型。
>4. mybatis自动将结果集封装成Java对象， 通过statement的resultType定义输出的类型。避免了因sql变化，对结果集处理麻烦的问题。
