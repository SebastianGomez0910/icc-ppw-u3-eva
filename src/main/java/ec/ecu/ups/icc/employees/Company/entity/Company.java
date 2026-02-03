package ec.ecu.ups.icc.employees.Company.entity;

public class Company {
    
    public Long id;
    public String name;
    public String country;

    public Character active;

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

    public Company(Long id, String name, String country, Character active) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.active = active;
    }

    
}
