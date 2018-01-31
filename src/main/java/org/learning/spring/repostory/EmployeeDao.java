package org.learning.spring.repostory;


import org.learning.spring.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();
    public Employee findById(long id);
    public List<Employee>  findByName(String firstName);
    public void save(Employee e);
    public Employee remove(long id);
    public Employee update(Employee e);
}
