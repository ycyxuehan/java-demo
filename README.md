# JAVA DEMO


## 使用帮助
 

```bash
## 拉取源码打包
$ git clone http://git.smartfeng.com/Nesting/zc-ucenter.git
$ cd DemoSpringBoot

$ mvn clean compile package -DskipTests

# ls target/DemoSpringBoot.jar


## 启动项目
cd target
 
# 端口指定 在后面追加 --server.port=8013,默认8013
# 以 dev 配置启动 (默认)
java -jar DemoSpringBoot.jar --spring.profiles.active=dev

# 测试
curl http://localhost:8080

```