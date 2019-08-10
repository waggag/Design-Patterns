package cn.waggag.factorymethod.A2;


import cn.waggag.factorymethod.A2.framework.Factory;
import cn.waggag.factorymethod.A2.framework.Product;
import cn.waggag.factorymethod.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
