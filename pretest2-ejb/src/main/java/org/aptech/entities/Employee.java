package org.aptech.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId", columnDefinition = "varchar(10)")
    private String employeeId;
    @Column(name = "employeeName", columnDefinition = "varchar(50)")
    private String employeeName;

//    @ManyToMany
//    @JoinTable(name = "employee_company", joinColumns = {@JoinColumn(name = "employeeId")}, inverseJoinColumns = {@JoinColumn(name = "companyId")})
//
//    private Set<Company> companies = new HashSet<>();
//    @ManyToMany
//    @JoinTable(name = "employee_company")
//    public  Set<Company> companies;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<EmployeeCompany> companies = new ArrayList<>();

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    @OneToMany(mappedBy = "employee")
//    private Collection<EmployeeCompany> employeeCompany;
//
//    public Collection<EmployeeCompany> getEmployeeCompany() {
//        return employeeCompany;
//    }
//
//    public void setEmployeeCompany(Collection<EmployeeCompany> employeeCompany) {
//        this.employeeCompany = employeeCompany;
//    }

}
