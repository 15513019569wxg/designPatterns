package __20备忘录模式.theory;/*
    @author wxg
    @date 2021/12/27-11:24
    */

public class Memento {
    private final String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
