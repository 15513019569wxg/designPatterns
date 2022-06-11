package __10组合模式;/*
    @author wxg
    @date 2021/12/26-0:49
    */

public class Department extends OrganizationComponent {

    //没有集合
    public Department(String name, String des) {
        super(name, des);
    }


    //add , remove 就不用写了，因为是叶子节点
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

}

