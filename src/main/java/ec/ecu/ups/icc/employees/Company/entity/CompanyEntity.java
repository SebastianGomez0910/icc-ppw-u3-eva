package ec.ecu.ups.icc.employees.Company.entity;

import java.util.List;

import ec.ecu.ups.icc.employees.Department.entity.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="companies")
public class CompanyEntity {
    private Long id;
    private String name;
    private String country;
    private Character active;
    private List<Department> departments;
    
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
    }

    public CompanyEntity() {
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}

