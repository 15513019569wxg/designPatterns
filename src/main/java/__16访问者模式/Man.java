package __16访问者模式;/*
    @author wxg
    @date 2021/12/26-17:23
    */

public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
