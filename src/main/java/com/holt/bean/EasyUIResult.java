Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@WZFlik 
WZFlik
/
host-usermanager
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights Settings
host-usermanager
/
src
/
main
/
java
/
com
/
holt
/
bean
/
EasyUIResult.java
 

1
package com.holt.bean;

import java.util.List;

/**
 * 封装了User的集合 和user总数
 * @author hot
 *
 */
public class EasyUIResult {
	
	//总条数
	private Long total;
	
	//数据列表
	private List<?> rows;
	
	public EasyUIResult() {
		super();
	}

	public EasyUIResult(Long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}


	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	<project xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<parent>
				<groupId>cn.itcast.parent</groupId>
				<artifactId>itcast-parent</artifactId>
				<version>0.0.1-SNAPSHOT</version>
			</parent>
			<groupId>com.holt.usermanage</groupId>
			<artifactId>holt-usermanage</artifactId>
			<version>1.0.0-SNAPSHOT</version>
			<packaging>war</packaging>

			<dependencies>
				<!--Junit -->
				<dependency>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
					<scope>test</scope>
				</dependency>

				<!-- Spring -->
				<dependency>
					<groupId>org.springframework</groupId>
					<artifactId>spring-context</artifactId>
				</dependency>
				<dependency>
					<groupId>org.springframework</groupId>
					<artifactId>spring-beans</artifactId>
				</dependency>
				<dependency>
					<groupId>org.springframework</groupId>
					<artifactId>spring-webmvc</artifactId>
				</dependency>
				<dependency>
					<groupId>org.springframework</groupId>
					<artifactId>spring-jdbc</artifactId>
				</dependency>
				<dependency>
					<groupId>org.springframework</groupId>
					<artifactId>spring-aspects</artifactId>
				</dependency>

				<!-- Mybatis -->
				<dependency>
					<groupId>org.mybatis</groupId>
					<artifactId>mybatis</artifactId>
				</dependency>
				<dependency>
					<groupId>org.mybatis</groupId>
					<artifactId>mybatis-spring</artifactId>
				</dependency>
				<!--分页助手  -->
				<dependency>
					<groupId>com.github.pagehelper</groupId>
					<artifactId>pagehelper</artifactId>
				</dependency>
				<dependency>
					<groupId>com.github.jsqlparser</groupId>
					<artifactId>jsqlparser</artifactId>
				</dependency>
				
				<!-- 通用mapper -->
				<dependency>
				    <groupId>com.github.abel533</groupId>
				    <artifactId>mapper</artifactId>
				</dependency>
				

				<!-- MySql -->
				<dependency>
					<groupId>mysql</groupId>
					<artifactId>mysql-connector-java</artifactId>
				</dependency>

				<dependency>
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-log4j12</artifactId>
				</dependency>

				<!-- Jackson Json处理工具包 -->
				<dependency>
					<groupId>com.fasterxml.jackson.core</groupId>
					<artifactId>jackson-databind</artifactId>
				</dependency>

				<!-- 连接池 -->
				<dependency>
					<groupId>com.jolbox</groupId>
					<artifactId>bonecp-spring</artifactId>
				</dependency>

				<!-- httpclient -->
				<dependency>
					<groupId>org.apache.httpcomponents</groupId>
					<artifactId>httpclient</artifactId>
				</dependency>

				<!-- JSP相关 -->
				<dependency>
					<groupId>jstl</groupId>
					<artifactId>jstl</artifactId>
				</dependency>
				<dependency>
					<groupId>javax.servlet</groupId>
					<artifactId>servlet-api</artifactId>
					<scope>provided</scope>
				</dependency>
				<dependency>
					<groupId>javax.servlet</groupId>
					<artifactId>jsp-api</artifactId>
					<scope>provided</scope>
				</dependency>

				<!-- Apache工具组件 -->
				<dependency>
					<groupId>org.apache.commons</groupId>
					<artifactId>commons-lang3</artifactId>
				</dependency>
				<dependency>
					<groupId>org.apache.commons</groupId>
					<artifactId>commons-io</artifactId>
				</dependency>

				

			</dependencies>

			<build>
				<plugins>
					<!-- 配置Tomcat插件 -->
					<plugin>
						<groupId>org.apache.tomcat.maven</groupId>
						<artifactId>tomcat7-maven-plugin</artifactId>
						<configuration>
							<port>80</port>
							<path>/</path>
						</configuration>
					</plugin>
				</plugins>
			</build>

		</project>

}
46
​
@WZFlik
Commit changes
Commit summary
Update EasyUIResult.java
Optional extended description
Add an optional extended description…
 Commit directly to the master branch.
 Create a new branch for this commit and start a pull request. Learn more about pull requests.
 
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
