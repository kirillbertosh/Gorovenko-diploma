package by.gorovenko.diploma.model;

import javax.persistence.*;

@Entity
@Table(name = "measures")
public class Measure {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;

    public Measure() {

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

    @Override
    public String toString() {
        return "Measure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
