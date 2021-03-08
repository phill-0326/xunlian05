package afternoon.homework;

/**
 * 设计一个Dog类，有名字、颜色和年龄属性，定义一个show方法显示信息。创建对象进行测试
 * author：phil
 */
public class homeWork07 {
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.show("旺财","黄色",3);
    }
}
class Dog{
    String name;
    String color;
    int age;
    public void show(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
        System.out.println("这只狗的名字叫 "+name+" 颜色为 "+ color+" 年龄 "+age+ "岁啦！");
    }
}