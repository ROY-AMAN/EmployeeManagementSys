package roy.aman.employeemanagment.SupportEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

    private Integer emp_id;
    @NotEmpty
    @Size(min = 4, message = "Username must be min of 4 characters !!")
    private String name;
    @Email(message = "Invalid Email Address, Please enter a valid email!")
    private String email;
    private String state;
    @NotEmpty
    @Column(unique = true)
    @Size(min=10,max = 10, message = "Number must be of 10 digits !!")
    private String mobile;
    private String designation;

}
