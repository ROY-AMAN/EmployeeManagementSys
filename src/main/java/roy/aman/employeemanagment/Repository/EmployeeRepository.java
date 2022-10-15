package roy.aman.employeemanagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.aman.employeemanagment.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
