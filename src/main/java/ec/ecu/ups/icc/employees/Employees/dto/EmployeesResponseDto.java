package ec.ecu.ups.icc.employees.Employees.dto;

import ec.ecu.ups.icc.employees.Company.entity.Company;
import ec.ecu.ups.icc.employees.Department.entity.Department;

public class EmployeesResponseDto {
    
    public Company company;
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
    public Double salary;

    public Department department;
}
