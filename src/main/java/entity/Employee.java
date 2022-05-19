package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String city;
	private int age;
	private double salary;
	private String department;
	

}
