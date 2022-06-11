package __04抽象工厂模式.order;/*
    @author wxg
    @date 2021/12/25-8:57
    */

import __04抽象工厂模式.pizza.Pizza;

public  interface AbsFactory {
    //让下面的工厂子类来 具体实现
     Pizza createPizza(String orderType);
}
