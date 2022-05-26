package StreamJava8IQ.MapMethod;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String companies;
    int salary;

    Employee(int empId, String companies, int salary) {
        this.empId = empId;
        this.companies = companies;
        this.salary = salary;

    }

}
public class FilterAndMap {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        //How we add object in employee list
        employeeList.add(new Employee(101, "Alex", 1000));
        employeeList.add(new Employee(101, "Alex", 1000));
        employeeList.add(new Employee(101, "Alex", 1000));
        //Another way to add object in the list using arrays.asList
        List<Employee> employeeList1 = Arrays.asList(new Employee(10, "BT", 1000),
        new Employee(11, "BT", 2000),
        new Employee(12, "BT", 3000),
                new Employee(13, "BT", 4000)
                );
        //combination of map and filter
          List<Integer> SalaryEmployee = employeeList1.stream().filter(e -> e.salary>1000).map(n -> n.salary-300).collect(Collectors.toList());
        System.out.println(SalaryEmployee);
        System.out.println("******Without storing another variable ********");
        employeeList1.stream().filter(s -> s.salary > 1000).map(k -> k.salary-300).forEach(num -> System.out.println(num));


    }
}
