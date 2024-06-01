package org.surya.repo;

import org.surya.employeeDTo.Employee;

import java.util.List;

public interface EmployeeRepo {
    public void saveEmpDetails(Employee employee);

    public void updateEmpById(String name,String adress,String dep,int emp_sal,int id);

    public void deleteById(int id);


}
