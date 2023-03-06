package org.aptech.entities;

import org.hibernate.annotations.Target;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "company")

public class Company {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyId", columnDefinition = "varchar(10)")
    private String companyId;
    @Column(name = "companyName",columnDefinition = "varchar(50)")
    private String companyName;

//    @ManyToMany(mappedBy = "company")
//
//    private Set<Employee> employees = new HashSet<>();
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmployeeCompany> employeeCompanies = new ArrayList<>();

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
