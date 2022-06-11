package __09装饰者模式.mycoffee;/*
    @author wxg
    @date 2021/12/25-21:35
    */

import __09装饰者模式.mycoffee.Coffee;

public class Espresso extends Coffee {
    public Espresso() {
        setDes(" 意大利咖啡 ");
        setPrice(6.0f);
    }
}
