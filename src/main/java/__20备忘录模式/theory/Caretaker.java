package __20备忘录模式.theory;/*
    @author wxg
    @date 2021/12/27-11:26
    */

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    //在List 集合中会有很多的备忘录对象
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第index个Originator 的 备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
