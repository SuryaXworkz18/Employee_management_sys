package org.surya.repo;

import org.surya.employeeDTo.Employee;

import java.sql.*;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo{
    @Override
    public void saveEmpDetails(Employee employee) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
           Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/present","root","Surya@7892");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into present_emp values(?,?,?,?,?)");
            preparedStatement.setInt(1,employee.getEmp_Id());
            preparedStatement.setString(2,employee.getName());
            preparedStatement.setString(3,employee.getAdress());
            preparedStatement.setString(4,employee.getDepartment());
            preparedStatement.setInt(5,employee.getEmpSalary());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateEmpById(String name,String adress,String dep,int emp_sal,int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
          Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/present","root","Surya@7892");
          PreparedStatement ps=connection.prepareStatement("update present_emp set emp_name=?,emp_adress=?,emp_dep=?,emp_salary=? where emp_id=?");

          ps.setString(1,name);
          ps.setString(2,adress);
          ps.setString(3,dep);
          ps.setInt(4,emp_sal);
          ps.setInt(5,id);
          ps.executeUpdate();
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }


    }

    @Override
    public void deleteById(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/present","root","Surya@7892");
            PreparedStatement ps=connection.prepareStatement("delete from present_emp where emp_id=?");
            ps.setInt(1,id);
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
