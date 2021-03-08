package morning;

/**
 * 定义一个类比较两个人的名字和姓名是否是一样的，真输出true假输出false
 * author：phil
 */
public class thisExercise {
    public static void main(String[] args) {
        Person p1 = new Person("jack",23);
        Person p2 = new Person("jack",23);
        System.out.println("p1和p2的比较结果 ："+ p1.compareTo(p2));
    }

}
class Person{
    String name ;
    int age ;
    //构造器初始化
    public  Person(String name,int age){
      this.name = name;
      this.age = age;
    }
    public boolean compareTo(Person p){
       /* if(this.name.equals(p.name) ){
            if (this.age == p.age){
                return true;
            }else{
                return false;
            }
        }else{
            return false;*/

            return this.name.equals(p.name) && this.age==p.age;

        }
    }
