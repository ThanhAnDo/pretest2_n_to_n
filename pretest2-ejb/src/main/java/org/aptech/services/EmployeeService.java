package org.aptech.services;

import org.aptech.entities.Employee;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(String employeeId);
    public boolean addEmployee(Employee employee);
    public  boolean updateEmployee(Employee employee);
    public  boolean deleteEmployee(String employeeId);
}
