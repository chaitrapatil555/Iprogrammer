package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findByDepartment(String department);
    @Query("SELECT COUNT(*) AS NO_OF_EMPLOYEES, CITY.DEPT_NAME, FROM EMP,CITY,WHERE EMP.DEPT_ID=CITY.DEPT_ID,GROUP BY EMP.DEPT_ID,ORDER BY NO_OF_EMPLOYEES")
	Employee getById(Long id);

	

}