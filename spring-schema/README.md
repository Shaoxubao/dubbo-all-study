### 自定义标签的作用
    自定义标签可以说是spring为了给类似你我这样的开发人员扩展组件使用的，
    因为它提供了一个标准的公共可插拔的接口；目前我们都知道spring非常强大，
    不过实际上除了spring-core和spring-beans外，其他都是通过自定义标签扩展实现的，
    其次还有一些开源组件也是，如dubbo等。

### Spring的自定义配置
    完成一个spring的自定义配置一般需要以下5个步骤：
    
    1、设计配置属性和JavaBean
    2、编写XSD文件 全称就是 XML Schema 它就是校验XML，定义了一些列的语法来规范XML
    3、编写NamespaceHandler和BeanDefinitionParser完成解析工作
    4、编写spring.handlers和spring.schemas串联起所有部件
    5、在Bean文件中应用