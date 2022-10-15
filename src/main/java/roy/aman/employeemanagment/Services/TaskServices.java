package roy.aman.employeemanagment.Services;


import roy.aman.employeemanagment.Entity.Employee;
import roy.aman.employeemanagment.Entity.Task;
import roy.aman.employeemanagment.SupportEntity.EmployeeDto;
import roy.aman.employeemanagment.SupportEntity.TaskDto;

import java.util.Date;

public interface TaskServices{

    TaskDto createTask(TaskDto taskDto);
    String deleteTask(Integer taskId);
    TaskDto updateTask(TaskDto taskDto, Integer taskId);
    TaskDto[] getTasksWithInPeriod(Date date1,Date date2);
    TaskDto[] getAllTaskOfEmployee(Integer empId);

}
