package afternoon.homework;

public class homeWork09 {
    public static void main(String[] args) {
        Music music = new Music("等你下课",211);
        music.play();
        music.getInfo();
    }
}
class Music{
    String name;
    int time;
    //构造器
    public Music(String name,int time){
        this.name = name;
        this.time = time;
    }
    //定义play方法
    public void play(){
        System.out.println("即将播放歌曲，请稍后....");
    }
    //定义返回信息的功能
    public void getInfo(){
        System.out.println("歌曲名为 "+name+" 时长："+time +"s");
    }
}