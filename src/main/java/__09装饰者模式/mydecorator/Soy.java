package __09装饰者模式.mydecorator;/*
    @author wxg
    @date 2021/12/25-21:51
    */

import __09装饰者模式.Drink;
import __09装饰者模式.mydecorator.Decorator;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        // TODO Auto-generated constructor stub
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }

}
