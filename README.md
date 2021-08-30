Mybatis work on principle of Mapper

Add Below annotation in main method class
@MappedTypes(User.class)
@MapperScan("com.learnandgrow.springbootmybatis.mapper")

Add mybatis and mysql dependencies

<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
</dependency>
<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>2.1.4</version>
</dependency>

Create a mapper interface and write methods to do operations
and add anotation on interface level
@Mapper

Add annotations along with query

@select
@insert
@delete
@update

Add below config in application prop file

server.port=9096
spring.datasource.url=jdbc:mysql://localhost:3306/demo
spring.datasource.username=username
spring.datasource.password=password
spring.datasource.testWhileIdle=true
spring.datasource.validationQuery=SELECT 1




