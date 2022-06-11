package __12享元模式;/*
    @author wxg
    @date 2021/12/26-10:30
    */

import java.util.HashMap;

// 网站工厂类，根据需要返回一个网站
public class WebSiteFactory {

    //集合， 充当池的作用
    private final HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}