## Builder Design Pattern


- 定义
    装配多个简单对象为一个复杂对象

- 适用场景
    - 构建一个由多个独立对象组成的对象
    - When the construction process must allow different representations for the object that is constructed.
    - 向客户隐藏实例化过程或实际返回类型

- 优势
    - 被创建的对象与创建过程隔离
    - 类代码和实例化代码相互独立 互不影响
    - 实例化过程可控
    - 实例化过程可重用

- 局限
    - 在创建多个复杂对象时需要足够的灵活性
    - 需要创建复杂的大量的对象

## real world Usage example
    Some examples of using the Builder pattern in knowledge engineering include
    different generators. Parsers in various compilers are also designed using the
    Builder pattern.
