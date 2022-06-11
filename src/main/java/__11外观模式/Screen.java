package __11外观模式;/*
    @author wxg
    @date 2021/12/26-9:14
    */

public class Screen {
    private static final Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }


    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }

}
