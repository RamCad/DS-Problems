package PracticeProblems.SortObjects;

public class Employee implements Comparable<Employee>{

  private Integer employeeNumber;
  private String firstName;
  private String lastName;

  @Override
  public int compareTo(Employee o) {
    if(this.employeeNumber > o.employeeNumber) return 1;
    if(this.employeeNumber < o.employeeNumber) return -1;
    return 0;
  }

  public Employee() {
  }

  public Employee(Integer employeeNumber, String firstName, String lastName) {
    this.employeeNumber = employeeNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeNumber=" + employeeNumber +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}

