package by.gorovenko.diploma.model.journals;

import by.gorovenko.diploma.model.Goods;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "arrival_journals")
public class ArrivalJournal {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private long documentNumber;
    @Column
    private Date arrivalDate;
    @OneToOne
    private Goods goods;
    @Column
    private double arrivalAmount;
    @Column
    private String notes;

    public ArrivalJournal() {

    }

    public long getId() {
        return id;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getArrivalAmount() {
        return arrivalAmount;
    }

    public void setArrivalAmount(double arrivalAmount) {
        this.arrivalAmount = arrivalAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "ArrivalJournal{" +
                "id=" + id +
                ", documentNumber=" + documentNumber +
                ", arrivalDate=" + arrivalDate +
                ", goods=" + goods +
                ", arrivalAmount=" + arrivalAmount +
                ", notes='" + notes + '\'' +
                '}';
    }
}
