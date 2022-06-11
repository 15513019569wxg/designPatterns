package __16访问者模式;/*
    @author wxg
    @date 2021/12/26-17:22
    */

public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}

