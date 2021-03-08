package morning.homework;

/**
 * 编写一个类更改书的价格，当价格大于150更改为150，大于100更改为100，其余的不变。
 * author：phil
 */
public class homeWork03 {
    public static void main(String[] args) {
        Book book = new Book();
        int price = 20;
        System.out.println("原价为"+ price +"元价格的书现在更改为："+book.updatePrice(price));
    }
}
class Book{
    public int updatePrice(int num){
        if (num > 150){
            return num = 150;
        }else if (num > 100){
            return num = 100;
        }else{
            return num;
        }
    }
}