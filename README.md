# xiao-java-designs
head first design patterns

### design patterns 
1. 策略模式 - Strategy Pattern
- 模式：策略模式定义了算法簇，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
- 举例：人(国王，皇后，士兵)使用武器(剑，小刀，斧头)，每一种人都可以使用不同的武器。
- 举例：鸭子叫(大叫，吱吱叫，默叫)，飞（用翅膀飞，不会飞）
- 举例：首先人拿着武器，打仗，然后换个武器，打仗。鸭子叫，然后换个叫法，再叫。
- 建议：多用组合，少用继承

2. 观察者模式 - Observer Pattern
- 模式：观察者模式在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。
- 举例：天气数据(主题)，设置的时候，天气情况变了，通知所有调用者。调用者得到通知，进行业务逻辑的处理。
- 建议：松耦合的OO设计

3. 装饰器模式 - Decorator Pattern
- 模式：装饰器模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承者更有弹性的替代方案。
- 举例：加糖和带摩卡的意式咖啡
- 建议：对扩展开放，对修改关闭。

4. 抽象工厂模式 - Abstract Factory Pattern
- 模式：抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
- 举例：各种原料的组合，才能做成一个披萨。不同原料的组合，由一个抽象工厂类来创建。
- 建议：依赖反转，依赖抽象，而不是具体类

5， 工厂方法模式 - Factory Method Pattern
- 模式：工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
- 举例：各种各样的披萨，需要哪种口味，就由哪个工厂来创建。
- 建议：依赖反转，依赖抽象，而不是具体类

6. 单例模式 - Singleton Pattern
- 模式：单例模式确保一个类只有一个实例，并提供一个安全的访问点。
- 举例：巧克力工厂操作同一个锅炉生产巧克力。锅炉空了加水，锅炉满了停止加水。可能一个认为没有满，实际上已经满了。

7. 命令模式 - Command Pattern
- 模式：命令模式将请求封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
- 举例：控制器里面有命令对象，接受到打开灯的命令对象，执行打开灯的操作。

8. 适配器模式 - Adapter Pattern
- 模式：适配器模式将一个类的接口，转化成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
- 举例：鸭子类之前可以叫，火鸡也想把它“呱呱”的行为当做叫声。把火鸡包装一下，变为鸭子。

9. 外观模式 - Facade Pattern
- 模式：外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观模式定义了一个高层接口，让子系统更容易使用。
- 举例：一个人下班回家，点一个播放，就可以完成看电影，关电影，听cd，关cd，听广播，关广播一系列操作。
- 建议：最少知识原则，只暴露有用的部分。

10. 模板方法模式 - Template Method Pattern
- 模式: 模板方法模式在一个方法中定义一个算法的框架，而将一些步骤延迟到子类中。模板方法可以使得子类在不改变算法结构的情况下，重新定义算法中的某些步骤。
- 举例：煮咖啡的步骤，准备，烧水，倒水，加调料。具体实现自己决定。
- 建议：别主动调用父类，子类只负责写实现，自然会被调用。

11，迭代器模式 - Iterator Pattern 




2、BUILDER
4、PROTOTYPE
7、BRIDGE
8、COMPOSITE
11、FLYWEIGHT
12、PROXY
13、CHAIN OF RESPONSIBLEITY
15、INTERPRETER
17、MEDIATOR
18、MEMENTO
20、STATE
23、VISITOR

创建型模式用来处理对象的创建过程，主要包含以下5种设计模式：
 工厂方法模式（Factory Method Pattern）
 抽象工厂模式（Abstract Factory Pattern）
 建造者模式（Builder Pattern）
 原型模式（Prototype Pattern）
 单例模式（Singleton Pattern）

结构型模式用来处理类或者对象的组合，主要包含以下7种设计模式：
 适配器模式（Adapter Pattern）
 桥接模式（Bridge Pattern）
 组合模式（Composite Pattern）
 装饰者模式（Decorator Pattern）
 外观模式（Facade Pattern）
 享元模式（Flyweight Pattern）
 代理模式（Proxy Pattern）

行为型模式用来对类或对象怎样交互和怎样分配职责进行描述，主要包含以下11种设计模式：
 责任链模式（Chain of Responsibility Pattern）
 命令模式（Command Pattern）
 解释器模式（Interpreter Pattern）
 迭代器模式（Iterator Pattern）
 中介者模式（Mediator Pattern）
 备忘录模式（Memento Pattern）
 观察者模式（Observer Pattern）
 状态模式（State Pattern）
 策略模式（Strategy Pattern）
 模板方法模式（Template Method Pattern）
 访问者模式（Visitor Pattern）
