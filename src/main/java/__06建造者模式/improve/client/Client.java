package __06建造者模式.improve.client;/*
    @author wxg
    @date 2021/12/25-15:27
    */

import __06建造者模式.improve.control.CommonHouse;
import __06建造者模式.improve.control.HighBuilding;
import __06建造者模式.improve.control.HouseBuilder;
import __06建造者模式.improve.scheduler.HouseDirector;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成盖房子，返回产品(普通房子)
        HouseBuilder house = houseDirector.constructHouse();
        System.out.println(house.getClass().getSimpleName());

        //System.out.println("输出流程");

        System.out.println("--------------------------");
        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子，返回产品(高楼)
        final HouseBuilder house1 = houseDirector.constructHouse();
        System.out.println(house1.getClass().getSimpleName());

    }
}
