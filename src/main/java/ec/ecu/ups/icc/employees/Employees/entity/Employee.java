package ec.ecu.ups.icc.employees.Employees.entity;

public class Employee {
    
    public Long id;
    public String firtName;
    public String lastName;
    public String email;
    public Double salary;
    public Character active;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirtName() {
        return firtName;
    }
    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Character getActive() {
        return active;
    }
    public void setActive(Character active) {
        this.active = active;
    }
    
    public Employee(Long id, String firtName, String lastName, String email, Double salary, Character active) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.active = active;
    }
}
