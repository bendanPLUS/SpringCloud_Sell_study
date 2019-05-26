# SpringCloud_Sell
SpringCloud_Sell 慕课study

### MySQL数据准备：
    新建数据库：SpringCloud_Sell
    执行sql语句：  doc文件夹下的 SpringCloud_Sell.sql
    # springCloud-sell

### 项目介绍
| 服务名称 |服务描述  | 备注 |
| --- | --- | --- |
| eureka | 注册中心 | 可部署高可用的服务注册中心 |
| client | 客户端 | 测试使用客户端 | 
| doc | 文档中心 | 记录系列开发使用文档 |
| product | 商品服务 | 提供对商品系列操作服务 |
| order | 订单服务 | 对订单操作 |
| config | 统一配置中心 | 提供对各个服务的配置文件管理，各服务内使用bootstrap.yml |

### Eureka server高可用部署测试，单台服务器测试（相互注册）
执行eureka服务1：    
server.port: 8761  
client.service-url.defaultZone: http://localhost:8762/eureka/  
  
执行eureka服务2：    
server.port: 8762  
client.service-url.defaultZone: http://localhost:8761/eureka/    

这时候，client注册
eureka.client.service-url.defaultZone: http://localhost:8761/eureka/,http://localhost:8762/eureka/

