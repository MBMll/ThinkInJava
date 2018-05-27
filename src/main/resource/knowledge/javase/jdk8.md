## JDK1.8新特性
### 总结
1. 速度更快 - 红黑树
2. 代码更少 - Lambda
3. Stream API
4. 便于并行 - Parallel
5. 最大化减少空指针
### 1. HashMap 红黑树实现
链长度大于8, 采用红黑树. 除了add, 速度优于链表
### 2. ConcurrentHashMap 优化
Jdk1.7时隔壁级别CocnurrentLevel（锁分段机制）默认为16。

JDK1.8采取了CAS算法

Jdk1.8没有永久区，取而代之的是MetaSpace元空间，用的是物理内存。

### 3. Lambda 表达式
语法格式:
- 无参数,无返回值
```
Runnable r = () -> System.out.println("hello world"); 
r.run();
```
- 有参数,无返回值
```
(x) -> System.out.println("hello world");
```
- 只有一个参数, 省略小括号
```
x -> System.out.println("hello world");
```
- 有返回值, 多条语句和参数:
```
Comparator<Integer> c= (x, y) -> {
    System.out.println(Integer.compare(x, y) + "函数式接口");
    return Integer.compare(x, y);
}
```
### 4. Stream 流
一系列流水式中间操作, 是数据渠道
- 不存储
- 不改变源对象
- 延迟执行
### 5. 并行流
Stream API 可以声明性地通过 parallel() 与 sequential() 在并行流与顺序流之间进行切换。
### 6. Optional 类
Optional<T> 类(java.util.Optional) 是一个容器类，代表一个值存在或不存在，原来用null 表示一个值不存在，现在Optional 可以更好的表达这个概念。并且可以避免空指针异常。

常用方法： 
- Optional.of(T t) : 创建一个Optional 实例 
- Optional.empty() : 创建一个空的Optional 实例 
- Optional.ofNullable(T t):若t 不为null,创建Optional 实例,否则创建空实例 
- isPresent() : 判断是否包含值 
- orElse(T t) : 如果调用对象包含值，返回该值，否则返回t 
- orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回s 获取的值 
- map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty() 
- flatMap(Function mapper):与map 类似，要求返回值必须是Optional
### Date API 
- Clock
- Timezones
- LocalTime
- LocalDate
- LocalDateTime
### Annotation 多重注解
### 接口默认方法
