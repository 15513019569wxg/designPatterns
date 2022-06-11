package __15命令模式;/*
    @author wxg
    @date 2021/12/26-15:50
    */

public interface Command {
    //执行动作(操作)
    void execute();
    //撤销动作(操作)
    void undo();
}