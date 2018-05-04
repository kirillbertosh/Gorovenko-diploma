package by.gorovenko.diploma.model;

import javax.persistence.*;

@Entity
@Table(name = "contractors")
public class Contractor {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String phone;
}
