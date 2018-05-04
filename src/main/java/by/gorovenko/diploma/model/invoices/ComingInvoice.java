package by.gorovenko.diploma.model.invoices;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.Storage;
import by.gorovenko.diploma.model.Supplier;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "coming_invoices")
public class ComingInvoice {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Supplier supplier;
    @Column
    private Date date;
    @Column
    private long invoiceNumber;
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
    @OneToOne
    private Storage storage;

    public ComingInvoice() {

    }

    public long getId() {
        return id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
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

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "ComingInvoice{" +
                "id=" + id +
                ", supplier=" + supplier +
                ", date=" + date +
                ", invoiceNumber=" + invoiceNumber +
                ", goods=" + goods +
                ", amount=" + amount +
                ", price=" + price +
                ", priceWithoutDiscount=" + priceWithoutDiscount +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                ", addedValueTax=" + addedValueTax +
                ", addedValueTaxPrice=" + addedValueTaxPrice +
                ", storage=" + storage +
                '}';
    }
}