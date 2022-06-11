package __06建造者模式.improve.control;/*
    @author wxg
    @date 2021/12/25-15:20
    */

import __06建造者模式.improve.bean.House;

public abstract class HouseBuilder {
    protected House house = new House();

    //建造房子好， 将产品(房子) 返回（最好不要直接返回house对象）
    public HouseBuilder buildHouse() {
        return this;
    }



    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();


}
