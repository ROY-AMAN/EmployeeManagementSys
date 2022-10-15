package roy.aman.employeemanagment.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import roy.aman.employeemanagment.SupportEntity.Priority;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer task_id;

    private String title;
    private String description;
    private Boolean status;
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "assigned_employee_id")
    private Employee employee;

}
