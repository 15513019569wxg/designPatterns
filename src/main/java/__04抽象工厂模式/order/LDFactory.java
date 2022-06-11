package __04抽象工厂模式.order;/*
    @author wxg
    @date 2021/12/25-9:01
    */

import __04抽象工厂模式.pizza.LDCheesePizza;
import __04抽象工厂模式.pizza.LDPepperPizza;
import __04抽象工厂模式.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
