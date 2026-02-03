package ec.ecu.ups.icc.employees.Department.entity;

public class Department {
    public Long id;
    public String name;
    public Double budget;
    
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
    public Department(Long id, String name, Double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }
}

