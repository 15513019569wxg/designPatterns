package __19中介者模式;/*
    @author wxg
    @date 2021/12/27-10:02
    */

public abstract class Mediator {
    //将中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}