package org.chaidev.accessdatajpa.repo;

import java.util.List;

import org.chaidev.accessdatajpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}