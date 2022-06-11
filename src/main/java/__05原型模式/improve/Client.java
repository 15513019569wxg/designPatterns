package __05原型模式.improve;/*
    @author wxg
    @date 2021/12/25-9:49
    */

public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆

        System.out.println("sheep="  + sheep + " " + sheep.hashCode() + " sheep.friend= " + sheep.friend.hashCode());
        System.out.println("sheep2 =" + sheep2 + " " + sheep2.hashCode() + " sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep2 =" + sheep3 + " " + sheep3.hashCode() + " sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep2 =" + sheep4 + " " + sheep4.hashCode() + " sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep2 =" + sheep5 + " " + sheep5.hashCode() + " sheep5.friend=" + sheep5.friend.hashCode());

    }

}