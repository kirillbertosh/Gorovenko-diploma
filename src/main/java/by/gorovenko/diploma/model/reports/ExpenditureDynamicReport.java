package by.gorovenko.diploma.model.reports;

import by.gorovenko.diploma.model.Goods;
import by.gorovenko.diploma.model.Measure;

import javax.persistence.*;

@Entity
@Table(name = "expenditure_dynamic_reports")
public class ExpenditureDynamicReport {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Goods goods;
    @OneToOne
    private Measure measure;
    @Column
    private double beginingMonthBalance;
    @Column
    private double arrivalPerMonth;
    @Column
    private double consumptionPerMonth;
    @Column
    private double endMonthBalance;

    public ExpenditureDynamicReport() {

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

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public double getBeginingMonthBalance() {
        return beginingMonthBalance;
    }

    public void setBeginingMonthBalance(double beginingMonthBalance) {
        this.beginingMonthBalance = beginingMonthBalance;
    }

    public double getArrivalPerMonth() {
        return arrivalPerMonth;
    }

    public void setArrivalPerMonth(double arrivalPerMonth) {
        this.arrivalPerMonth = arrivalPerMonth;
    }

    public double getConsumptionPerMonth() {
        return consumptionPerMonth;
    }

    public void setConsumptionPerMonth(double consumptionPerMonth) {
        this.consumptionPerMonth = consumptionPerMonth;
    }

    public double getEndMonthBalance() {
        return endMonthBalance;
    }

    public void setEndMonthBalance(double endMonthBalance) {
        this.endMonthBalance = endMonthBalance;
    }

    @Override
    public String toString() {
        return "ExpenditureDynamicReport{" +
                "id=" + id +
                ", goods=" + goods +
                ", measure=" + measure +
                ", beginingMonthBalance=" + beginingMonthBalance +
                ", arrivalPerMonth=" + arrivalPerMonth +
                ", consumptionPerMonth=" + consumptionPerMonth +
                ", endMonthBalance=" + endMonthBalance +
                '}';
    }
}
