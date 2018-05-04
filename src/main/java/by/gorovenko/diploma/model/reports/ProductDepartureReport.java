package by.gorovenko.diploma.model.reports;

import by.gorovenko.diploma.model.Goods;

import javax.persistence.*;

@Entity
@Table(name = "product_departure_reports")
public class ProductDepartureReport {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Goods goods;
    @Column
    private double amount;
    @Column
    private double price;
    @Column
    private double totalPrice;
    @Column
    private String notes;

    public ProductDepartureReport() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "ProductDepartureReport{" +
                "id=" + id +
                ", goods=" + goods +
                ", amount=" + amount +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", notes='" + notes + '\'' +
                '}';
    }
}
