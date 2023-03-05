package org.aptech.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee_company")
public class EmployeeCompany {
    @EmbeddedId
    private EmployeeCompanyId id;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "companyId")
    private Company company;

    public EmployeeCompany() {
    }

    public EmployeeCompanyId getId() {
        return id;
    }

    public void setId(EmployeeCompanyId id) {
        this.id = id;
    }

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
