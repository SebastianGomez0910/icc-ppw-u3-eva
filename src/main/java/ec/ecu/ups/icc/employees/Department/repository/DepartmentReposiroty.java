package ec.ecu.ups.icc.employees.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.ecu.ups.icc.employees.Department.entity.DepartmentEntity;

@Repository
public interface DepartmentReposiroty extends JpaRepository<DepartmentEntity,Long>{

    
} 
