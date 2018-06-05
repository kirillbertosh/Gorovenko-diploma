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
    @Column
    private String address;

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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", storageNumber=" + storageNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
