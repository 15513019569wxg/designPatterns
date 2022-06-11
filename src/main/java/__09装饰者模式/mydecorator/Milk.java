package __09装饰者模式.mydecorator;/*
    @author wxg
    @date 2021/12/25-21:51
    */

import __09装饰者模式.Drink;
import __09装饰者模式.mydecorator.Decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
