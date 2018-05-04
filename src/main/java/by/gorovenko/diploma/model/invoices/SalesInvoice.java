package by.gorovenko.diploma.model.invoices;

import by.gorovenko.diploma.model.Goods;

import javax.persistence.*;

@Entity
@Table(name = "sales_invoices")
public class SalesInvoice {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Goods goods;
    @Column
    private int amount;
    @Column
    private double price;
    @Column
    private double priceWithoutDiscount;
    @Column
    private double discount;
    @Column
    private double totalPrice;
    @Column
    private double addedValueTax;
    @Column
    private double addedValueTaxPrice;

    public SalesInvoice() {

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceWithoutDiscount() {
        return priceWithoutDiscount;
    }

    public void setPriceWithoutDiscount(double priceWithoutDiscount) {
        this.priceWithoutDiscount = priceWithoutDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAddedValueTax() {
        return addedValueTax;
    }

    public void setAddedValueTax(double addedValueTax) {
        this.addedValueTax = addedValueTax;
    }

    public double getAddedValueTaxPrice() {
        return addedValueTaxPrice;
    }

    public void setAddedValueTaxPrice(double addedValueTaxPrice) {
        this.addedValueTaxPrice = addedValueTaxPrice;
    }

    @Override
    public String toString() {
        return "SalesInvoice{" +
                "id=" + id +
                ", goods=" + goods +
                ", amount=" + amount +
                ", price=" + price +
                ", priceWithoutDiscount=" + priceWithoutDiscount +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                ", addedValueTax=" + addedValueTax +
                ", addedValueTaxPrice=" + addedValueTaxPrice +
                '}';
    }
}
