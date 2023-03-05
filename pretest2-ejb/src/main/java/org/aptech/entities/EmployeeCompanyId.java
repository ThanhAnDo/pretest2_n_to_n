package org.aptech.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
@Embeddable
public class EmployeeCompanyId implements Serializable {
    @Column(name = "employeeId", columnDefinition = "varchar(10)")
    private String employee_id;
    @Column(name = "companyId", columnDefinition = "varchar(10)")
    private String company_id;

    public EmployeeCompanyId() {
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
