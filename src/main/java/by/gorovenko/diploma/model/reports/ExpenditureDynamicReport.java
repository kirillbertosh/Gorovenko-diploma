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
    @Column
    private double beginMonthBalance;
    @Column
    private double arrivalPerMonth;
    @Column
    private double consumptionPerMonth;
    @Column
    private double endMonthBalance;
    @Column
    private String month;

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getBeginMonthBalance() {
        return beginMonthBalance;
    }

    public void setBeginMonthBalance(double beginMonthBalance) {
        this.beginMonthBalance = beginMonthBalance;
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
                ", beginMonthBalance=" + beginMonthBalance +
                ", arrivalPerMonth=" + arrivalPerMonth +
                ", consumptionPerMonth=" + consumptionPerMonth +
                ", endMonthBalance=" + endMonthBalance +
                ", month='" + month + '\'' +
                '}';
    }
}
