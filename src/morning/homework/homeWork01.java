package morning.homework;

/**
 * 定义一个方法求出double类型数组的最大值
 * author：phil 
 */
public class homeWork01 {
    public static void main(String[] args) {
       A01 a = new A01();
      //  System.out.println("最大值为："+a.max(22.2,11.2));
        double [] arr = null;
        Double res = a.max(arr);
        if (res != null){
            System.out.println("该数组的最大值为："+a.max(arr));
        }else{
            System.out.println("数组输入有误");
        }
    }
}
//考虑程序的健壮性
class A01{
    public Double max(double[] arr){ //Double 是一个包装类可以返回null

       if (arr != null && arr.length>0){
           double max = arr[0];
           for (int i = 1; i < arr.length; i++) {
               if (max<arr[i]){
                   max=arr[i];
               }
           }
           return max;
       }else{
           return null;
       }
    }
}