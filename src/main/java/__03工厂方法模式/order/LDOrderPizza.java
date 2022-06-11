package __03工厂方法模式.order;/*
    @author wxg
    @date 2021/12/25-8:25
    */

import __03工厂方法模式.pizza.LDCheesePizza;
import __03工厂方法模式.pizza.LDPepperPizza;
import __03工厂方法模式.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
