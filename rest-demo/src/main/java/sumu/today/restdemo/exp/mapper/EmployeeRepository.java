package sumu.today.restdemo.exp.mapper;


import org.springframework.data.jpa.repository.JpaRepository;
import sumu.today.restdemo.exp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
