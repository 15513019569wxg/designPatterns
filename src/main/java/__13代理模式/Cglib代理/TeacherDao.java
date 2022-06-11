package __13代理模式.Cglib代理;/*
    @author wxg
    @date 2021/12/26-11:47
    */

public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
