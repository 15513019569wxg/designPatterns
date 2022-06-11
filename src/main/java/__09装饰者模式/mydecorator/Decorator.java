package __09装饰者模式.mydecorator;/*
    @author wxg
    @date 2021/12/25-21:44
    */

import __09装饰者模式.Drink;

public class Decorator extends Drink {
    private final Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
