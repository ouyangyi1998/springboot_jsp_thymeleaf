# springboot实现jsp与thymeleaf无缝切换
- 原代码 https://github.com/xuwujing/springBoot-study
- lombok注解开发 
  - @Data 包括 equal() toString() get() set()方法
  - @AllArgsConstructor  constructor 包含所有声明的类属性
  - @NoArgsConstructor 空构造
- jsp与thymeleaf的切换使用同一套后端代码，在controller的跳转声明略有不同
  - springboot版本为1.5.9 ，所以在2.0以上的springboot在jpa的规范上略有不同
  - 顺便说一下@Table 的用法 name标注数据库名称 @Table注解的常用选项是 name，用于指明数据库的表名，@Table注解还有两个选项 catalog 和 schema 用于设置表所属的数据库目录或模式，通常为数据库名
  - 在webConfig中配置jsp的路径sufix和prefix配置 jsp 扫描路径，setOrder(2)设置优先级为2，thymeleaf要渲染的html文件放在默认的resource.templates下面
- jsp与thymeleaf代码的区别
  - 在循环体上直接在tr上面操作循环 <tr th:each="user :${users}"> ，   <c:forEach items="${users}" var="user"> jstl表达式 
- 直接跑原代码不成功，debug了好久最终把thymeleaf模板放在默认路径下面。。。玄学。。。
