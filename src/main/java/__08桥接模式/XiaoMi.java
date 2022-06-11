package __08桥接模式;/*
    @author wxg
    @date 2021/12/25-20:22
    */

public class XiaoMi implements Brand{
    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机开机 ");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机关机 ");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println(" 小米手机打电话 ");
    }
}
