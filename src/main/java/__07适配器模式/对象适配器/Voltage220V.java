package __07适配器模式.对象适配器;/*
    @author wxg
    @date 2021/12/25-16:41
    */

//被适配的类
public class Voltage220V {
    //输出220V的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
