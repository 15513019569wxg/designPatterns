package __07适配器模式.类适配器;/*
    @author wxg
    @date 2021/12/25-16:19
    */

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        final int i;
        i = srcV / 44;
        return i;
    }
}
