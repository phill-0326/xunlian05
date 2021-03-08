package afternoon.homework;

/**
 * 输出一个对应半径的面积
 * author：phil
 */
public class homeWork13 {
    public static void main(String[] args) {
        circle c = new circle();
        c.printAreas(c,5);
    }
}
class circle{
    double radius;

   /* public  circle(double radius){
        this.radius = radius;
    }*/

    public double findArea(){
        return Math.PI * radius *radius;
    }

    //设置一个setRadius 的方法
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void printAreas( circle c ,double times){
        System.out.println("radius\tarea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(i+"    \t"+c.findArea());
        }
    }
}