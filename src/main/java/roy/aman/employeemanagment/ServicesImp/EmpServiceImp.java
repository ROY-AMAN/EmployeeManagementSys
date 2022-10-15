package roy.aman.employeemanagment.ServicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.aman.employeemanagment.Repository.EmployeeRepository;
import roy.aman.employeemanagment.Services.EmployeeService;
import roy.aman.employeemanagment.SupportEntity.EmployeeDto;

@Service
public class EmpServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public String deleteEmployee(Integer empId) {
        return null;
    }

    @Override
    public EmployeeDto getEmployeeDetails(Integer empId) {
        return null;
    }
}
