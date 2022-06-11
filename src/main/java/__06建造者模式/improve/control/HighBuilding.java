package __06建造者模式.improve.control;/*
    @author wxg
    @date 2021/12/25-15:24
    */

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println(house + " 打地基100米 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(house + " 砌墙20cm ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(house + " 透明屋顶 ");
    }

}
