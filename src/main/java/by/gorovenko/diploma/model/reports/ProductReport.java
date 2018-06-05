package by.gorovenko.diploma.model.reports;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_reports")
public class ProductReport {

    @Id
    @GeneratedValue
    private long id;

    public ProductReport() {

    }

}
