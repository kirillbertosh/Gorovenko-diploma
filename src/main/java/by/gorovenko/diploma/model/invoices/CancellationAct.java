package by.gorovenko.diploma.model.invoices;

import by.gorovenko.diploma.model.Goods;

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
    private Date incomingDate;
    @Column
    private Date outcomingDate;
    @OneToMany
    private Set<ComingInvoice> comingInvoices;
    @OneToOne
    private Goods goods;
    
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

    public Set<ComingInvoice> getComingInvoices() {
        return comingInvoices;
    }

    public void setComingInvoices(Set<ComingInvoice> comingInvoices) {
        this.comingInvoices = comingInvoices;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "CancellationAct{" +
                "id=" + id +
                ", actDate=" + actDate +
                ", actNumber=" + actNumber +
                ", incomingDate=" + incomingDate +
                ", outcomingDate=" + outcomingDate +
                ", comingInvoices=" + comingInvoices +
                ", goods=" + goods +
                '}';
    }
}
