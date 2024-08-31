package com.EmployeePortalMVC.EmployeePortal.Controller;

import com.EmployeePortalMVC.EmployeePortal.Model.Employee;
import com.EmployeePortalMVC.EmployeePortal.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@org.springframework.stereotype.Controller


public class Controller {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String getmessage() {
        return "employee";
    }

    @GetMapping("/employeeData")
    public String getData(Model model) {
        List<Employee> data = service.displayEMployeeData();
        model.addAttribute("employeeData", data);
        return "Display";
    }


    @GetMapping("/addEmployee")
    public String addEmployeeData(Model model) {
        model.addAttribute("addTemp", new Employee());
        return "addEmployee";
    }

    @PostMapping("/addEmployeedata")
    public String addEmployee(Employee e) {
        service.addEmployee(e);
        return "redirect:/employeeData";
    }

    @GetMapping("/updateTempData/{id}")
    public String updateData(@PathVariable int id, Model model) {
        //      Employee emp=null;


        //  List<Employee> employee=service.displayEMployeeData();
        for (Employee e : service.displayEMployeeData()) {
            if (id == e.getEmpId()) {
                model.addAttribute("tempEmployee", e);
            }
        }
        return "update";
    }

    @GetMapping("/updateEmployeeData")
    public String updateData(Employee e) {
        service.addEmployee(e);
        return "redirect:/employeeData";
    }


    @GetMapping("/delete/{id}")
    public String deletedata(@PathVariable int id) {
        service.deleteData(id);
        return "redirect:/employeeData";
    }


}

