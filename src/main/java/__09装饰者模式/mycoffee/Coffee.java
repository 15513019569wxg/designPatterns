package __09装饰者模式.mycoffee;/*
    @author wxg
    @date 2021/12/25-21:33
    */

import __09装饰者模式.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
