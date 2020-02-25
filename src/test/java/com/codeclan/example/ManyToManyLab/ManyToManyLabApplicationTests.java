package com.codeclan.example.ManyToManyLab;

import com.codeclan.example.ManyToManyLab.Models.Department;
import com.codeclan.example.ManyToManyLab.Models.Employee;
import com.codeclan.example.ManyToManyLab.Models.Project;
import com.codeclan.example.ManyToManyLab.Repositories.DepartmentRepository;
import com.codeclan.example.ManyToManyLab.Repositories.EmployeeRepository;
import com.codeclan.example.ManyToManyLab.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("human resources");
		departmentRepository.save(department);

		Employee employee = new Employee("Stephen", "Ramsey", 972, department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeeAndProject(){
		Department department = new Department("human resources");
		departmentRepository.save(department);

		Employee employee = new Employee("Stephen", "Ramsey", 972, department);
		employeeRepository.save(employee);

		Project project = new Project("mems", 4);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

	@Test
	public void canDoAMegaJoingTeam(){
		Department department = new Department("human resources");
		departmentRepository.save(department);

		Employee employee = new Employee("Stephen", "Ramsey", 972, department);
		employeeRepository.save(employee);

		Employee employee1 = new Employee("Paddy", "ONeil", 345, department);

		Project project = new Project("memes", 4);

		Project project1 = new Project("Photography", 5);

		project.addEmployee(employee);
		projectRepository.save(project);

		project1.addEmployee(employee);
		project1.addEmployee(employee1);
		projectRepository.save(project);
	}

}
