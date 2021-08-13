# everyinterview

## 简介
+ 这个关于面试以及一切的题库及代码
+ 数据结构算法
+ 数据库
+ java面试题
+ 运维
+ 原理
+ 解决方案
+ 管理

## 使用方式
`git clone`按需复制到自己的项目里即可

## 组件版本
| 组件                     | Version       |
| ------------------------ | ------------- |


## 目录
```
├── src
│   ├── main
│      ├── java
│      │   └── com
│      │       └── xjl
│      │           └── everyinterview
│      │               ├── EveryinterviewApplication.java
│      │               ├── datastructureandalgorithm
│      │                   ├── datastructure
│      │                   │    └──
│      │                   └── algorithm
│      └── resources
│          ├── application.properties
│          ├── static
│          └── templates
├── pom.xml
```

## maven说明
因为elasticsearch-rest-high-level-client7.3.2 依赖 elasticsearch 6.4.2 和 elasticsearch-rest-client 6.4.2 ，而目前这已经是中央仓库中最高版本的jar包了（8.0.0）还未迁入中央仓库，所以我们手动引入7.3.2的新版本elasticsearch和elasticsearch-rest-client

```xml
        <!-- high client-->
        <dependency>
            <groupId>org.elasticsearch.client</groupId>
            <artifactId>elasticsearch-rest-high-level-client</artifactId>
            <version>7.3.2</version>
            <exclusions>
                <exclusion>
                    <groupId>org.elasticsearch.client</groupId>
                    <artifactId>elasticsearch-rest-client</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.elasticsearch</groupId>
                    <artifactId>elasticsearch</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.elasticsearch/elasticsearch -->
        <dependency>
            <groupId>org.elasticsearch</groupId>
            <artifactId>elasticsearch</artifactId>
            <version>7.3.2</version>
        </dependency>

        <!--rest low client-->
        <dependency>
            <groupId>org.elasticsearch.client</groupId>
            <artifactId>elasticsearch-rest-client</artifactId>
            <version>7.3.2</version>
        </dependency>

        <!-- springboot-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
```

