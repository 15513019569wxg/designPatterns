package __15命令模式;/*
    @author wxg
    @date 2021/12/26-15:51
    */

public class LightOnCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }

}