package org.learning.spring.services;


import org.learning.spring.model.Employee;
import org.learning.spring.repostory.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(long id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> findByName(String firstName) {
        return employeeDao.findByName(firstName);
    }

    @Override
    public void save(Employee e) {
        employeeDao.save(e);
    }

    @Override
    public Employee remove(long id) {
        return employeeDao.remove(id);
    }

    @Override
    public Employee update(Employee e) {
        return employeeDao.update(e);
    }
}
