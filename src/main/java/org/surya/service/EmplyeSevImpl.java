package org.surya.service;

import org.surya.employeeDTo.Employee;
import org.surya.repo.EmployeeRepoImpl;

public class EmplyeSevImpl implements EmpService{
    @Override
    public void saveEmpDetails(Employee employee) {
        EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
        if(employee.getEmp_Id()!=0 && employee.getName()!=null && employee.getAdress()!=null && employee.getDepartment()!=null &&
        employee.getEmpSalary()!=0){
            employeeRepo.saveEmpDetails(employee);
        }else {
            System.out.println("null valles ");
        }
    }

    @Override
    public void updateDetails(String name,String address,String dept,int sal,int emp_id) {
        EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
     if(!name.isEmpty() && !address.isEmpty() && !dept.isEmpty() && sal!=0 && emp_id!=0  ){
         employeeRepo.updateEmpById(name,address,dept,sal,emp_id);

     }
    }

    @Override
    public void deleteByID(int emp_id) {
        EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
        if(emp_id!=0){
            employeeRepo.deleteById(emp_id);

        }else {
            System.out.println("delete is not possible");
        }
    }
}
