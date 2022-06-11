package __11外观模式;/*
    @author wxg
    @date 2021/12/26-9:38
    */

public class HomeTheaterFacade {

    //定义各个子系统对象
    private final TheaterLight theaterLight;
    private final Popcorn popcorn;
    private final Stereo stereo;
    private final Projector projector;
    private final Screen screen;
    private final DVDPlayer dVDPlayer;


    //构造器
    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dVDPlayer = DVDPlayer.getInstance();
    }

    //操作分成 4 步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dVDPlayer.play();
    }

    public void pause() {
        dVDPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dVDPlayer.off();
    }

}
