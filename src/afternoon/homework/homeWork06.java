package afternoon.homework;

/**
 * 编写一个类实现两个数的和、差、乘、商的方法调用，当商的除数为0时应该提示进行修改
 * author：phil
 */
public class homeWork06 {
    public static void main(String[] args) {
        Cale cale = new Cale();
        cale.add(22.2,33.5);
        cale.red(22.6,56.7);
        cale.pro(12.3,45.2);
        cale.chu(14.5,0);
    }
}
class Cale{
  /*  double num1,num2;
    public Cale(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }*/
    //求和方法
    public void add(double a ,double b){
        System.out.println("两数的和为 ："+(a+b));
    }
    //求差方法
    public void red(double a ,double b){
        System.out.println("两个数的差 ："+(a-b));
    }
    //求乘积方法
    public void pro(double a,double b){
        System.out.println("两个数的乘积："+(a*b));
    }
    //求商方法
    public void chu(double a,double b){
        if (b == 0){
            System.out.println("除数不能为0，请修改！");
        }else{
            System.out.println("两数的相除："+(a/b));
        }
    }
}