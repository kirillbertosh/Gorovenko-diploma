package by.gorovenko.diploma.model;

import javax.persistence.*;

@Entity
@Table(name = "storages")
public class Storage {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private int storageNumber;


    public Storage() {

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

    public int getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(int storageNumber) {
        this.storageNumber = storageNumber;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", storageNumber=" + storageNumber +
                '}';
    }
}
