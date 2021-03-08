package afternoon.homework;

/**
 * 实现数组的复制功能cpoyArr,输入就数组，返回一个新数组，元素和旧数组一样
 * author：phil
 */
public class homeWork04 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        a03.copyArr(new int[]{2,3,4,5,7,8});
    }
}
class A03{
    //构造器
    //int[] arr ;

   /* public A03(int [] arr){
        this.arr =arr;
    }*/
    //编写一个copyArr
    public void copyArr(int [] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           // System.out.print(arr[i]+"\t");
            newArr[i] = arr[i];
        }
        System.out.println("======新数组newArr======");
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(+newArr[j]+"\t");
        }
    }
}