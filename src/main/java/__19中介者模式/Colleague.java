package __19中介者模式;/*
    @author wxg
    @date 2021/12/27-10:02
    */

//同事抽象类
public abstract class Colleague {
    private final Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
