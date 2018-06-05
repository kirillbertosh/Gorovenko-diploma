package by.gorovenko.diploma.model.journals;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.Storage;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "common_journals")
public class CommonJournal {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private long documentNumber;
    @Column
    private Date arrivalDate;
    @Column
    private Date consumptionDate;
    @OneToOne
    private Goods goods;
    @Column
    private double arrivalAmount;
    @Column
    private double consumptionAmount;
    @OneToOne
    private Storage storage;
    @Column
    private String notes;

    public CommonJournal() {

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

    public double getArrivalAmount() {
        return arrivalAmount;
    }

    public void setArrivalAmount(double arrivalAmount) {
        this.arrivalAmount = arrivalAmount;
    }

    public double getConsumptionAmount() {
        return consumptionAmount;
    }

    public void setConsumptionAmount(double consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CommonJournal{" +
                "id=" + id +
                ", documentNumber=" + documentNumber +
                ", arrivalDate=" + arrivalDate +
                ", consumptionDate=" + consumptionDate +
                ", goods=" + goods +
                ", arrivalAmount=" + arrivalAmount +
                ", consumptionAmount=" + consumptionAmount +
                ", storage=" + storage +
                ", notes='" + notes + '\'' +
                '}';
    }
}
