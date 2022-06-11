# java8运行环境
FROM java:8
# 作者名称
MAINTAINER Sumu

# 切换工作目录
WORKDIR /root/java

# 添加demo-start-1.0.0.jar文件到docker环境内
ADD rest-demo-0.0.1.jar /root/java/rest-demo-0.0.1.jar
# 暴露端口8080
EXPOSE 8080
# 运行命令
ENTRYPOINT ["java", "-server", "-Xms512m", "-Xmx512m", "-jar", "/root/java/rest-demo-0.0.1.jar"]