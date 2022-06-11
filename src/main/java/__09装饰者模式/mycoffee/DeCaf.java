package __09装饰者模式.mycoffee;/*
    @author wxg
    @date 2021/12/25-21:38
    */

import __09装饰者模式.mycoffee.Coffee;

public class DeCaf extends Coffee {
    public DeCaf() {
        setDes(" 无因咖啡 ");
        setPrice(1.0f);
    }
}
