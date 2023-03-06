package org.aptech.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee_company")
public class EmployeeCompany implements Serializable {
//    @EmbeddedId
//    private EmployeeCompanyId id;
    @Id
    @ManyToOne
    private Employee employee;
    @Id
    @ManyToOne
    private Company company;

    public EmployeeCompany() {
    }

//    public EmployeeCompanyId getId() {
//        return id;
//    }
//
//    public void setId(EmployeeCompanyId id) {
//        this.id = id;
//    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
