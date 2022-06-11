package __17迭代器模式;/*
    @author wxg
    @date 2021/12/26-20:31
    */

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位置
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }
    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
    //删除的方法，默认空实现
    public void remove() {}
}
