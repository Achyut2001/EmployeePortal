package com.EmployeePortalMVC.EmployeePortal.Service;

import com.EmployeePortalMVC.EmployeePortal.Model.Employee;
import com.EmployeePortalMVC.EmployeePortal.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> displayEMployeeData() {
        return repository.findAll();
    }


    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public void deleteData(int id) {
        repository.deleteById(id);
    }
}
