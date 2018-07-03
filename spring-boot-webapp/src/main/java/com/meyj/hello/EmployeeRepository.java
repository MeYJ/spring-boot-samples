package com.meyj.hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Yang Jun on 2018/7/3.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
