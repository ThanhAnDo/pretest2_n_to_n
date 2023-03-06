package org.aptech.services;

import org.aptech.entities.Employee;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Stateless(name = "EmployeeEJB")
@LocalBean
public class EmployeeBean implements EmployeeService {
  private final EntityManager entityManager;


  public EmployeeBean() {
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("pretest2PersistenceUnit");
    entityManager = managerFactory.createEntityManager();
  }

  @Override
  public List<Employee> getAllEmployee() {
    return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
  }

  @Override
  public int getEmployeeById(String employeeId) {
    Employee employee = null;
    return entityManager.createQuery("select e from Employee e", Employee.class).getFirstResult();
  }

  @Override
  public boolean addEmployee(Employee employee) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(employee);
      entityManager.getTransaction().commit();
      return true;
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
  }

  @Override
  public boolean updateEmployee(Employee employee) {
    return false;
  }

  @Override
  public boolean deleteEmployee(String employeeId) {
    return false;
  }
}
