#数据库优化

mysql综合优化
~~~text
1.表的设计合理化（符合2NF）
2.添加适当索引（index）{四种：普通索引、主键索引、唯一索引unique、全文索引}
3.分表技术（水平分割、垂直分割）
4.读写分离（写：update、delete、add）
5.存储过程（模块化编程，可以提高速度）
6.对mysql配置优化（配置最大并发数 my.ini 文件中，调整缓存大小）
7.mysql服务器硬件升级
8.定时去除不需要的数据，定时进行碎片整理（MyISAM）
~~~

什么样的表符合3NF(范式)
~~~text
表的范式，是首先符合1NF，才能满足3NF，进一步满足3NF

1NF：即表的列具有原子性，不可再分割，即列的信息，不能分解，只有数据库满足是关系型数据库，就自动满足1NF

2NF：表中的记录是唯一的，就满足2NF，通常通过设计一个主键来实现

3NF：表中没有冗余数据，就是说表的信息，如果能被推导出来，就不应该单独设计一个字段存储
~~~

数据库的分类
~~~text
关系型数据库：mysql、oracle、sqlserver、db2
非关系型数据库：（特点：面向对象或者集合）
NoSql数据库：MongoDB（特点：面向文档）
~~~

SQL优化 定位慢查询
show status 查询mysql运行时间/执行次数/当前连接等
~~~text
show status like 'uptime';
show status like 'com_select'; com_insert、com_update、com_delete
show (session\global) status like ...; 默认是session会话，指取出当前窗口的执行；想看从mysql启动到现在的，用global
show status like 'connections'; //试图连接MYSQL次数
show status like 'slow_queries'  //查看慢查询次数；mysql默认10秒才是慢查询
show variables like 'long_query_time'; //查询慢查询限定时间
set long_query_time = 1 //修改慢查询时间
~~~



    











    