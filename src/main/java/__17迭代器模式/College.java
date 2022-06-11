package __17迭代器模式;/*
    @author wxg
    @date 2021/12/26-20:29
    */

import java.util.Iterator;

public interface College {

    String getName();
    //增加系的方法
    void addDepartment(String name, String desc);
    //返回一个迭代器,遍历
    Iterator  createIterator();
}