package ec.ecu.ups.icc.employees.Department.entity;

import java.util.List;

import ec.ecu.ups.icc.employees.Company.entity.Company;
import ec.ecu.ups.icc.employees.Employees.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentEntity {
    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private Company company;
    private List<Employee> employees;
    
    public DepartmentEntity() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBudget() {
        return budget;
    }
    public void setBudget(Double budget) {
        this.budget = budget;
    }
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
