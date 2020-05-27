package com.serverlessfargate.employeerestaws;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
  private int ssn;
  private String name;
  private String city;
}
