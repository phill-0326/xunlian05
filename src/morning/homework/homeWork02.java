package morning.homework;

/**
 * 编写一个类A02定义方法find，实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1.
 * author:phil
 */
public class homeWork02 {
    public static void main(String[] args) {
        A02 a02 = new A02(new String[]{"abs", "jjj", "aaa","ccc","vvv"});
        System.out.println(a02.find("ddd"));
    }
}
class A02{
    //构造器
    String[] arr;
    public A02(String[] arr){
        this.arr = arr;
    }

    //find方法
    public int find(String  str){
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])){
                return i;
            }else{
                continue;
            }
        }
        return -1;
    }
}