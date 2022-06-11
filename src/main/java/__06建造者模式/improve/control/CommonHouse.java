package __06建造者模式.improve.control;/*
    @author wxg
    @date 2021/12/25-15:22
    */


import __06建造者模式.improve.bean.House;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(house + " 打地基5米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(house + " 砌墙10cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(house + " 屋顶 ");
    }

}
