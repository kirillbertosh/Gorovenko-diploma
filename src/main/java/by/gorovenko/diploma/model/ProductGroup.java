package by.gorovenko.diploma.model;

import javax.persistence.*;

@Entity
@Table(name = "product_groups")
public class ProductGroup {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @OneToOne
    private ProductGroup parentProductGroup;
    @Column
    private float valueAddedTax;

    public ProductGroup() {

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

    public ProductGroup getParentProductGroup() {
        return parentProductGroup;
    }

    public void setParentProductGroup(ProductGroup parentProductGroup) {
        this.parentProductGroup = parentProductGroup;
    }

    public float getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(float valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    @Override
    public String toString() {
        return "ProductGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentProductGroup=" + parentProductGroup +
                ", valueAddedTax=" + valueAddedTax +
                '}';
    }
}
