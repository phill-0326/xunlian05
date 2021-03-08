package afternoon.homework;

/**
 * 创建一个类，属性有（名字、性别、年龄、职业、薪水），要求用三个构造器且复用构造器
 * author：phil
 */
public class homeWork12 {
    public static void main(String[] args) {
        Employee employee = new Employee("张三","男",23);
        employee.show();
    }
}
class Employee{
    String name;
    String sex;
    int age;
    String position;
    int sal;
    public Employee(String name,String sex,int age,String position,int sal){
        this(name,sex,age);//调用 构造器
        this.position = position;
        this.sal = sal;
    }
    public Employee(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Employee(String position,int sal){
        this.position = position;
        this.sal = sal;
    }
    public void show(){
        System.out.println(this.name+this.sex+this.age+this.position+this.sal);
    }
}