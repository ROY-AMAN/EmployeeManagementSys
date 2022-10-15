package roy.aman.employeemanagment.Services;

import roy.aman.employeemanagment.Entity.Employee;
import roy.aman.employeemanagment.SupportEntity.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    String deleteEmployee(Integer empId);
    EmployeeDto getEmployeeDetails(Integer empId);

}
