package __04抽象工厂模式.order;/*
    @author wxg
    @date 2021/12/25-8:59
    */

import __04抽象工厂模式.pizza.BJCheesePizza;
import __04抽象工厂模式.pizza.BJPepperPizza;
import __04抽象工厂模式.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
