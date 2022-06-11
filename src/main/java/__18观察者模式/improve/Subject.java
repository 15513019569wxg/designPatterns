package __18观察者模式.improve;/*
    @author wxg
    @date 2021/12/26-21:52
    */

//接口, 让WeatherData 来实现
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}