package by.gorovenko.diploma.model.reports;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.Storage;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "product_balance_reports")
public class ProductBalanceReport {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Goods goods;
    @Column
    private double amount;
    @OneToOne
    private Storage storage;


    public ProductBalanceReport() {

    }

    public long getId() {
        return id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "ProductBalanceReport{" +
                "id=" + id +
                ", goods=" + goods +
                ", amount=" + amount +
                ", storage=" + storage +
                '}';
    }
}
