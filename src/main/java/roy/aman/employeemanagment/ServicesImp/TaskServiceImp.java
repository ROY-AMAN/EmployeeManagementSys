package roy.aman.employeemanagment.ServicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import roy.aman.employeemanagment.Repository.EmployeeRepository;
import roy.aman.employeemanagment.Repository.TaskRepository;
import roy.aman.employeemanagment.Services.TaskServices;
import roy.aman.employeemanagment.SupportEntity.TaskDto;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class TaskServiceImp implements TaskServices {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        return null;
    }

    @Override
    public String deleteTask(Integer taskId) {
        return null;
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto, Integer taskId) {
        return null;
    }

    @Override
    public TaskDto[] getTasksWithInPeriod(Date date1, Date date2) {
        return new TaskDto[0];
    }

    @Override
    public TaskDto[] getAllTaskOfEmployee(Integer empId) {
        return new TaskDto[0];
    }
}
