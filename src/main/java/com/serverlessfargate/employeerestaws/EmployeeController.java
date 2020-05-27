package com.serverlessfargate.employeerestaws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @GetMapping("/employees")
  public List<Employee> getEmpList(){
    return DataLoader.getEmployees().get();
  }

  @GetMapping("/employees/ssn/{ssn}")
  public Employee getEmpBySsn(@PathVariable int ssn){
    return DataLoader.getEmployeeBySnn(ssn).get();
  }
  @GetMapping("/employees/name")
  public List<Employee> getEmpOrderByName(){
    return DataLoader.getEmployeesByName().get();
  }
  @GetMapping("/employees/city")
  public List<Employee> getEmpOrderByCity(){
    return DataLoader.getEmployeesByCity().get();
  }
}
