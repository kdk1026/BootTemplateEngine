# BootTemplateEngine

### 출력, Loop, Include, IF 등 순수한 View Template인 Mustanche 에 초점 맞춰서 정리
| 구분 |
|----|
|Freemarker|
|Thymeleaf|
|Mustanche|

### JSP의 경우, WAR 배포만 지원하므로 제외
* pom.xml
```
<!-- JSP -->
<dependency>
	<groupId>org.apache.tomcat.embed</groupId>
	<artifactId>tomcat-embed-jasper</artifactId>
	<scope>provided</scope>
</dependency>
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
</dependency>
```
	
* application.properties
