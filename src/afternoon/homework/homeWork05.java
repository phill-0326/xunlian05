package afternoon.homework;

/**
 * 输入一个半径输出一个圆的周长和面积
 * author：phil
 */
public class homeWork05 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.show(3);
    }
}
class Circle{
    double primeter;
    double area;
    public void show(double num){
        primeter = 2 * 3.14 * num;
        System.out.println("该圆的周长为："+primeter);
        area = 3.14 * num * num;
        System.out.println("该圆的面积为："+area);
    }
}