package __11外观模式;/*
    @author wxg
    @date 2021/12/26-9:17
    */

public class Client {
    public static void main(String[] args) {
        //这里直接调用。。 很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
