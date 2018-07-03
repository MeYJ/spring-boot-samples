package com.meyj.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Yang Jun on 2018/7/2.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
