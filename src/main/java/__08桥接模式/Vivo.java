package __08桥接模式;/*
    @author wxg
    @date 2021/12/25-20:23
    */

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话 ");
    }

}
