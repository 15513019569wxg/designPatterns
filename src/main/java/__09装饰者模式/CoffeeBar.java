package __09装饰者模式;/*
    @author wxg
    @date 2021/12/25-21:52
    */

import __09装饰者模式.mycoffee.DeCaf;
import __09装饰者模式.mycoffee.LongBlack;
import __09装饰者模式.mydecorator.Chocolate;
import __09装饰者模式.mydecorator.Milk;

public class CoffeeBar {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        // 1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("描述=" + order.getDes());
        System.out.println("费用1=" + order.cost());

        // 2. order 加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());
        System.out.println("order 加入一份牛奶 费用 =" + order.cost());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());
        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());
        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());

        System.out.println("===========================");

        Drink order2 = new DeCaf();
        System.out.println("order2 无因咖啡 描述 = " + order2.getDes());
        System.out.println("order2 无因咖啡  费用 =" + order2.cost());


        order2 = new Milk(order2);
        System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());
        System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());


    }
}
