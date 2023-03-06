package org.aptech.controllers;

import org.aptech.entities.Company;
import org.aptech.entities.Employee;
import org.aptech.entities.EmployeeCompany;
import org.aptech.enums.Action;
import org.aptech.services.EmployeeBean;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/employee")
public class EmployeeController extends HttpServlet {
    @EJB
    EmployeeBean employeeBean;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (Action.Create.toString().equalsIgnoreCase(action)) {
            Employee employee = getEmployee(request);
            if (employeeBean.addEmployee(employee)) {
                request.getServletContext().getRequestDispatcher("/Insert.jsp").include(request, response);
                response.getWriter().write("Add Emmployee Success.");
            } else {
                response.getWriter().write("Add Emmployee Fail.");
            }

        }
    }

    private Employee getEmployee(HttpServletRequest request) {
        String employeeId = request.getParameter("employeeId");
        String employeeName = request.getParameter("employeeName");
        String companyId = request.getParameter("companyId");
        String companyName = request.getParameter("companyName");

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);

        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyName(companyName);

        EmployeeCompany employeeCompany = new EmployeeCompany();
        employeeCompany.setEmployee(employee);
        employeeCompany.setCompany(company);


        return employee;
    }
}
