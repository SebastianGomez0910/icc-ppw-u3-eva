package ec.ecu.ups.icc.employees.Department.dto;

import ec.ecu.ups.icc.employees.Company.entity.Company;
import ec.ecu.ups.icc.employees.Employees.entity.Employee;

public class DepartmentWithEmployeesDto {
 
    public Long id;
    public String name;
    public Double budget;

    public Company company;
    public Employee employee;
}
