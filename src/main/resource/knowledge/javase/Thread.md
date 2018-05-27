### sleep() wait() 区别
|区别点| sleep()| wait()|
|---|---|---|
|来自不同的类| Thread | Object |
|释放锁|没有|释放同步资源|
|作用范围|可以在其他任何地方使用| wait(), notify(), notifyAll() 只能在同步控制方法或者同步控制块|
|异常|必须捕获interruptException|不需要|
|静态|静态方法,只能控制当前线程|非静态方法|

