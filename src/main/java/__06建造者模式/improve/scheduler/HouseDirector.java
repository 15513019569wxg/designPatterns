package __06建造者模式.improve.scheduler;/*
    @author wxg
    @date 2021/12/25-15:25
    */

import __06建造者模式.improve.control.HouseBuilder;
import __06建造者模式.improve.bean.House;

/**
 * 调度者的调度工具是houseBuilder,houseBuilder被不同的house继承,从而形成不同的houseBuilder
 */
public class HouseDirector {
    HouseBuilder houseBuilder;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public HouseBuilder constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
