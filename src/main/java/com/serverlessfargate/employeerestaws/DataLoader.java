package com.serverlessfargate.employeerestaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public interface DataLoader {

  public static final  List<Employee> EMPLOYEE_LIST = Arrays.asList(Employee.builder().ssn(120).name("Manvendra").city("Bangalore").build(),Employee.builder().ssn(121).name("Any").city("Bareilly").build(),Employee.builder().ssn(122).name("Joy").city("Kanpur").build(),Employee.builder().ssn(123).name("Manvendra").city("Bangalore").build(),Employee.builder().ssn(124).name("Deep").city("Noida").build(),Employee.builder().ssn(125).name("Amit").city("Pune").build());


  public static Optional<List<Employee>> getEmployees(){
    return Optional.of(EMPLOYEE_LIST);
  }
  public static Optional<Employee> getEmployeeBySnn(int ssn){
     return EMPLOYEE_LIST.stream().filter(employee -> employee.getSsn()==ssn).findFirst();
  }
  public static Optional<List<Employee>> getEmployeesByCity(){
    return Optional.of(EMPLOYEE_LIST.stream().sorted(Comparator.comparing(Employee::getCity)).collect(
        Collectors.toList()));
  }
  public static Optional<List<Employee>> getEmployeesByName(){
    return Optional.of(EMPLOYEE_LIST.stream().sorted(Comparator.comparing(Employee::getName)).collect(
        Collectors.toList()));
  }

}
