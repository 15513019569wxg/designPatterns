package __15命令模式;/*
    @author wxg
    @date 2021/12/26-16:22
    */

public class TVOnCommand implements Command {
    // 聚合TVReceiver
    TVReceiver tv;

    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}
