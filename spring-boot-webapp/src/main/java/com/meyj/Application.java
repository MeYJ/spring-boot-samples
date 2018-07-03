package com.meyj;

import com.meyj.hello.Department;
import com.meyj.hello.DepartmentRepository;
import com.meyj.hello.Employee;
import com.meyj.hello.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by MeYJ on 2018/6/7.
 */
@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        return (args) -> {
            Department department = new Department();
            department.setdName("研发部");

            Employee employee = new Employee();
            employee.seteName("张三");
            employee.setPhone("123456789");
            employee.setDepartment(department);

            Employee employee2 = new Employee();
            employee2.seteName("李四");
            employee2.setPhone("987654321");
            employee2.setDepartment(department);

            department.setEmployeeList(Arrays.asList(employee, employee2));

            employeeRepository.save(employee);
            employeeRepository.save(employee2);
            departmentRepository.save(department);
        };
    }

}
