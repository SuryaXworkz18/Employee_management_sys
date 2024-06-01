package org.surya.runner;

import com.mysql.cj.x.protobuf.MysqlxConnection;
import org.surya.employeeDTo.Employee;
import org.surya.repo.EmployeeRepoImpl;
import org.surya.service.EmpService;
import org.surya.service.EmplyeSevImpl;

public class Runner {
    public static void main(String[] args) {
        Employee employee=new Employee(1,"surya","shimoga","wce",55545);
        Employee employee1=new Employee(2,"liki","mm","dtt",5555);

        EmpService empService=new EmplyeSevImpl();
       // empService.saveEmpDetails(employee1);
      // empService.saveEmpDetails(employee);
       // employeeRepo.saveEmpDetails(employee);
       // empService.updateDetails("maii","dakd","qweoiqwoei",83883,2);

empService.deleteByID(1);

    }
}
