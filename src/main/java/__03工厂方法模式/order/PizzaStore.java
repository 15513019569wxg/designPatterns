package __03工厂方法模式.order;/*
    @author wxg
    @date 2021/12/25-8:26
    */

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种Pizza
        new BJOrderPizza();
        new LDOrderPizza();
    }
}
