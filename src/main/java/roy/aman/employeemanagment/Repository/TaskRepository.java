package roy.aman.employeemanagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.aman.employeemanagment.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
