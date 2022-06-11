package __05原型模式.deepclone;/*
    @author wxg
    @date 2021/12/25-10:16
    */

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
    }

    //因为该类的属性都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
