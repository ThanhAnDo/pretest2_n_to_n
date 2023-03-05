package org.aptech.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "company")

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyId", columnDefinition = "varchar(10)")
    private String companyId;
    @Column(columnDefinition = "varchar(50)")
    private String companyName;

    @ManyToMany(mappedBy = "company")
    @PrimaryKeyJoinColumn
    private Set<Employee> employees = new HashSet<>();

    public Company() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
