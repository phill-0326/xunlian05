package afternoon.homework;

/**
 * 在测试代码方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式，调用语句为：
 *  System.out.println(method(method(10.0,20.0),100));
 *  author:phil
 */
public class homeWork11 {
    public static void main(String[] args) {
        T t = new T();

    }
}
class T{

    public double method(double num1,double num2){
        return num1+ num2;
    }
}