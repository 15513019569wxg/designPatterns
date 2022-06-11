package __04抽象工厂模式.order;/*
    @author wxg
    @date 2021/12/25-9:03
    */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
