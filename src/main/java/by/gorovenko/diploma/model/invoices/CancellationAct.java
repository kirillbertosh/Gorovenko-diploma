package by.gorovenko.diploma.model.invoices;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.Storage;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "cancellation_acts")
public class CancellationAct {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private Date actDate;
    @Column
    private long actNumber;
    @Column
    private double amount;
    @Column
    private Date incomingDate;
    @Column
    private Date outcomingDate;
    @OneToOne
    private Goods goods;
    @OneToOne
    private Storage storage;
    @Column
    private String notes;
    
    public CancellationAct() {
        
    }

    public long getId() {
        return id;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public long getActNumber() {
        return actNumber;
    }

    public void setActNumber(long actNumber) {
        this.actNumber = actNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public Date getOutcomingDate() {
        return outcomingDate;
    }

    public void setOutcomingDate(Date outcomingDate) {
        this.outcomingDate = outcomingDate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CancellationAct{" +
                "id=" + id +
                ", actDate=" + actDate +
                ", actNumber=" + actNumber +
                ", amount=" + amount +
                ", incomingDate=" + incomingDate +
                ", outcomingDate=" + outcomingDate +
                ", goods=" + goods +
                ", storage=" + storage +
                ", notes='" + notes + '\'' +
                '}';
    }
}
