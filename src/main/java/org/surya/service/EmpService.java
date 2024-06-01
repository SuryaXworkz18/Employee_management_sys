package org.surya.service;

import org.surya.employeeDTo.Employee;

public interface EmpService {
    public void saveEmpDetails(Employee employee);
    public void updateDetails(String name,String address,String dept,int sal,int emp_id);

    public void deleteByID(int emp_id);
}
