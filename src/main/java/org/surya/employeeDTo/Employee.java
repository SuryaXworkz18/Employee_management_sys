package org.surya.employeeDTo;

public class Employee {
    private int emp_Id;
    private  String name;
    private String adress;
    private String department;
    private int empSalary;

    public int getEmp_Id() {
        return emp_Id;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getAdress() {
        return adress;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Employee(int emp_Id,String name, String adress,String department,int empSalary){
        this.emp_Id=emp_Id;
        this.name=name;
        this.adress=adress;
        this.empSalary=empSalary;
        this.department=department;
    }
}
