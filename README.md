1、spring-boot 版本  2.0.6.RELEASE  +  sharding-jdbc 4.0.0-RC1 

ShardingSphere实现分库 + 读写分离
有关ShardingSphere实现分库分表前面写了7篇博客作为该项目做详细说明。

1、[分库分表(1) --- 理论](https://www.cnblogs.com/qdhxhz/p/11608222.html)


2、[分库分表(2) --- ShardingSphere(理论)](https://www.cnblogs.com/qdhxhz/p/11629883.html)


3、[分库分表(3) ---SpringBoot + ShardingSphere实现读写分离](https://www.cnblogs.com/qdhxhz/p/11656205.html)

4、分库分表(4) ---SpringBoot + ShardingSphere 实现分表

5、分库分表(5) ---SpringBoot + ShardingSphere 实现分库分表

6、分库分表(6)--- SpringBoot+ShardingSphere实现分表+ 读写分离

7、分库分表(7)--- SpringBoot+ShardingSphere实现分库分表 + 读写分离

2、项目说明
场景 在实际开发中，如果数据库压力大我们可以通过 分库分表 的基础上进行 读写分离，来减缓数据库压力。

3、项目整体结构
spring-boot-sharding-ssphere # 父工程
 
  | #实现读写分离功能
  ---db-read-write 
 
  | #实现分表功能
  ---sub-table
    
  | #实现分库分表功能
  ---sub-db-table                      
     
  | #实现分表 + 读写分离
  ---sub-table-read-write                                        
  
   | #实现分库分表 + 读写分离
  ---sub-db-table-read-write          

代码参考 https://github.com/yudiandemingzi/spring-boot-sharding-sphere
