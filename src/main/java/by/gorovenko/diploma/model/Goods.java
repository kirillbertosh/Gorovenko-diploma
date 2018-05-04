package by.gorovenko.diploma.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String serialNumber;
    @Column
    private String producer;
    @OneToOne
    private Measure measure;
    @Column
    private String notes;
    @OneToMany
    @JoinTable(name = "goods_product_group", joinColumns
            = @JoinColumn(name = "goods_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_group_id",
                    referencedColumnName = "id"))
    private Set<ProductGroup> productGroups;

    public Goods() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<ProductGroup> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(Set<ProductGroup> productGroups) {
        this.productGroups = productGroups;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", producer='" + producer + '\'' +
                ", measure=" + measure +
                ", notes='" + notes + '\'' +
                '}';
    }
}
