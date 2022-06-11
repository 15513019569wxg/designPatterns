package __17迭代器模式;/*
    @author wxg
    @date 2021/12/26-20:32
    */

public class Department {
    private String name;
    private String desc;
    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
