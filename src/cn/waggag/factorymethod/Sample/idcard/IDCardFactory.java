package cn.waggag.factorymethod.Sample.idcard;
import cn.waggag.factorymethod.Sample.framework.Factory;
import cn.waggag.factorymethod.Sample.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {

    private HashMap database = new HashMap();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}
