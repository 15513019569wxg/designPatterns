package __02简单工厂模式.order;/*
    @author wxg
    @date 2021/12/24-21:40
    */

import __02简单工厂模式.pizza.CheesePizza;
import __02简单工厂模式.pizza.Pizza;
import __02简单工厂模式.pizza.GreekPizza;
import __02简单工厂模式.pizza.PepperPizza;

public class SimpleFactory {
    //增加orderType 返回对应的Pizza 对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        switch (orderType) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
                break;
        }
        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");
        switch (orderType) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
                break;
        }
        return pizza;
    }
}
