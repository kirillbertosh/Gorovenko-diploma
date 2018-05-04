package by.gorovenko.diploma.model.journals;

import by.gorovenko.diploma.model.Goods;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "consumption_journals")
public class ConsumptionJournal {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private long documentNumber;
    @Column
    private Date consumptionDate;
    @OneToOne
    private Goods goods;
    @Column
    private double consumptionAmount;
    @Column
    private String notes;

    public ConsumptionJournal() {

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

    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getConsumptionAmount() {
        return consumptionAmount;
    }

    public void setConsumptionAmount(double consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "ConsumptionJournal{" +
                "id=" + id +
                ", documentNumber=" + documentNumber +
                ", consumptionDate=" + consumptionDate +
                ", goods=" + goods +
                ", consumptionAmount=" + consumptionAmount +
                ", notes='" + notes + '\'' +
                '}';
    }
}
