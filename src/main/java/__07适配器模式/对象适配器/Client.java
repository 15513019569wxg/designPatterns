package __07适配器模式.对象适配器;/*
    @author wxg
    @date 2021/12/25-16:44
    */

public class Client {
    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
