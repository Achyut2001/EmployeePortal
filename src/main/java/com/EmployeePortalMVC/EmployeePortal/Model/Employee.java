package com.EmployeePortalMVC.EmployeePortal.Model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "employeeinfo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_desi")
    private String empDesi;

    @Column(name = "emp_sal")
    private double empSal;





    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesi() {
        return empDesi;
    }

    public void setEmpDesi(String empDesi) {
        this.empDesi = empDesi;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
}
