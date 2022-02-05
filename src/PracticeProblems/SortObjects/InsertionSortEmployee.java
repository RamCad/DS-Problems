package PracticeProblems.SortObjects;

public class InsertionSortEmployee {

  public static void main(String[] args) {
    Employee[] employees = new Employee[4];
    employees[0] = new Employee(123, "abc", "xyz");
    employees[1] = new Employee(921, "abc1", "xyz1");
    employees[2] = new Employee(12, "abc2", "xyz2");
    employees[3] = new Employee(450, "abc3", "xyz3");

    sort(employees);

    for(int i = 0; i< employees.length; i++) {
      System.out.println(employees[i]);
    }
  }

  public static void sort(Employee[] employees) {
    for(int i = 0; i < employees.length; i++) {
      Employee temp = employees[i];
      int j = i-1;
      while(j >= 0 && employees[j].compareTo(temp) > 0) {
        employees[j+1] = employees[j];
        j--;
      }
      employees[j+1] = temp;
    }
  }

}
