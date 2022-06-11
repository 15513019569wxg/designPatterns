package __02简单工厂模式.order;/*
    @author wxg
    @date 2021/12/24-21:36
    */

/**
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("~~退出程序~~");

        new OrderPizza2();
    }
}
