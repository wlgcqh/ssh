ssh
===
运行环境：struts2.3,spring3.1,hibernate4.1,mysql-5.1.1,dbcp2.0.1,pool2.2,windows 64
基本架构：典型的四层架构，分为action层，服务层，DAO层，数据库层
基本思路：利用Spring的IoC将对象的创建从action层剥离，在Spring中提供数据源以及SessionFactory,将事务从代码中分离，利用Spring的AOP在服务层加入事务管理，加入二级缓存ehcache，加入数据库连接池DBCP2
基本功能：简单的CRUD
