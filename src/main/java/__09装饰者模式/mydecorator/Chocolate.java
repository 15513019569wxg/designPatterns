package __09装饰者模式.mydecorator;/*
    @author wxg
    @date 2021/12/25-21:52
    */

import __09装饰者模式.Drink;

//具体的Decorator， 这里就是调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }

}

