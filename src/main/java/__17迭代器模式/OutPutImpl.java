package __17迭代器模式;/*
    @author wxg
    @date 2021/12/26-20:48
    */

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        //从collegeList 取出所有学院, Java中的List已经实现Iterator
        for (College college : collegeList) {
            //取出一个学院
            System.out.println("=== " + college.getName() + "=====");
            printDepartment(college.createIterator()); //得到对应迭代器
        }
    }

    //输出学院输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
