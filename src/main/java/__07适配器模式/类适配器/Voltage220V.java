package __07适配器模式.类适配器;/*
    @author wxg
    @date 2021/12/25-16:15
    */

public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
