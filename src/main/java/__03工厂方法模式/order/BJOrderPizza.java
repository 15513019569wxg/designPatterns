package __03工厂方法模式.order;/*
    @author wxg
    @date 2021/12/25-8:22
    */

import __03工厂方法模式.pizza.BJCheesePizza;
import __03工厂方法模式.pizza.BJPepperPizza;
import __03工厂方法模式.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
