# 配置说明 ##

`spring.swagger.enabled`：提供该配置目的是方便多环境关闭，一般生产环境中不会暴露它，这时候就可以通过 `java -jar xx.jar --spring.swagger.enabled=false` 动态关闭，也可以在多环境配置写好


### properties ###

```
spring.swagger.enabled=是否启用swagger，默认：true
spring.swagger.title=标题
spring.swagger.description=描述信息
spring.swagger.version=版本
spring.swagger.license=许可证
spring.swagger.licenseUrl=许可证URL
spring.swagger.termsOfServiceUrl=服务条款URL
spring.swagger.contact.name=维护人
spring.swagger.contact.url=维护人URL
spring.swagger.contact.email=维护人email
spring.swagger.base-package=swagger扫描的基础包，默认：全扫描
spring.swagger.base-path=需要处理的基础URL规则，默认：/**
spring.swagger.exclude-path=需要排除的URL规则，默认：空
spring.swagger.host=文档的host信息，默认：空
spring.swagger.globalOperationParameters[0].name=参数名
spring.swagger.globalOperationParameters[0].description=描述信息
spring.swagger.globalOperationParameters[0].modelRef=指定参数类型
spring.swagger.globalOperationParameters[0].parameterType=指定参数存放位置,参考ParamType:(header,query,path,body,form)
spring.swagger.globalOperationParameters[0].required=指定参数是否必传，默认false
#下面分组是
spring.swagger.groups.<name>.basePackage=swagger扫描的路径
#比如
spring.swagger.groups.基础信息.basePackage=com.battcn.controller.basic

# 关闭 JSR
spring.swagger.validator-plugin=false
# 全局消息体
spring.swagger.global-response-messages.GET[0].code=400
spring.swagger.global-response-messages.GET[0].message=server response 400
spring.swagger.global-response-messages.POST[0].code=400
spring.swagger.global-response-messages.POST[0].message=server response 400
spring.swagger.global-response-messages.POST[1].code=404
spring.swagger.global-response-messages.POST[1].message=server response 404
```


### yaml ###

以下为 `application.yml` 配置示例

``` yaml
spring:
  swagger:
    enabled: true
    title: 标题
    description: 描述信息
    version: 系统版本号
    contact:
      name: 维护者信息
    base-package: swagger扫描的基础包，默认：全扫描(分组情况下此处可不配置)
    #全局参数,比如Token之类的验证信息可以全局话配置
    global-operation-parameters:
    -   description: 'Token信息,必填项'
        modelRef: 'string'
        name: 'Authorization'
        parameter-type: 'header'
        required: true
    groups:
      basic-group:
        base-package: com.battcn.controller.basic
      system-group:
        base-package: com.battcn.controller.system
```