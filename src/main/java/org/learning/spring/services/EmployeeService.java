package org.learning.spring.services;

import org.learning.spring.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(long id);
    public List<Employee>  findByName(String firstName);
    public void save(Employee e);
    public Employee remove(long id);
    public Employee update(Employee e);
}
