package ec.ecu.ups.icc.employees.Employees.mapper;

import ec.ecu.ups.icc.employees.Employees.repository.EmployeeRepository;

public class EmployeeMapper {

    private EmployeeRepository repository;

    public EmployeeMapper(EmployeeRepository repository){
        this.repository=repository;
    }


}

