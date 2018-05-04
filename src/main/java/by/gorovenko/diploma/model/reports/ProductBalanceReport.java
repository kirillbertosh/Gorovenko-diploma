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
    private Map<Storage, Double> amountInStorage;

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

    public Map<Storage, Double> getAmountInStorage() {
        return amountInStorage;
    }

    public void setAmountInStorage(Map<Storage, Double> amountInStorage) {
        this.amountInStorage = amountInStorage;
    }

    @Override
    public String toString() {
        return "ProductBalanceReport{" +
                "id=" + id +
                ", goods=" + goods +
                ", amountInStorage=" + amountInStorage +
                '}';
    }
}
