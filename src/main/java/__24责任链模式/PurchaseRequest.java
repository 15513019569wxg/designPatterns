package __24责任链模式;/*
    @author wxg
    @date 2021/12/27-19:09
    */

public class PurchaseRequest {
    private final int type; //请求类型
    private final float price; //请求金额
    private final int id;
    //构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
    public int getType() {
        return type;
    }
    public float getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
}
