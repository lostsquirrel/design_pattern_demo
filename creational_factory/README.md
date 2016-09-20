## 工厂模式(Factory Patterns)

- 定义
	The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
	在工厂模式中，创建逻辑没有暴露线客户端，用同一个接口（表示、关联）被创建的对象
	
- 适用场景
    - 不能确定创建哪个类的实例
    - 希望了解类创建了哪些实例
    - 基类引用，不确认使用哪个子类实例
    - 对客户（调用者）隐藏实际的类型
    
- 优势
    - 不需要知道每一个子类，只需要知道 基类/接口和工厂对象
    - 对实例化过程进行封装（适用于实例化复杂的情况）

- 局限
    - 修改类型实现后需要重新编译