## 抽象工厂模式（Abstract Factory Pattern ）

- 定义

    The Abstract Factory Patternprovides an interface for creating families of related or dependent objects without specifying their concrete classes.

    由一组相互独立的工厂组成

    提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类(可能用于组合成一个对象)

    用于创建工厂对象

- 适用场景
    - 需要创建一组同一主题的实例且客户只需要知道怎么创建这些实例

- 优势
    - 修改组合类而不影响使用它的类，运行时也可以

- 局限
    - 增加不必要和复杂度
    - 编初始代码的额外工件量
