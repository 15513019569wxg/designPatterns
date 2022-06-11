package __20备忘录模式.theory;/*
    @author wxg
    @date 2021/12/27-11:24
    */

public class Originator {

    private String state;//状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象 Memento
    //因此编写一个方法，返回 Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento) {
        //  获得备忘录中的具体状态，重新设置state
        state = memento.getState();
    }
}

