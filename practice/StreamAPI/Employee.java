import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age,double salary) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}

class Driver {
    public static void main(String[] args) {

        List<Employee> elist = new ArrayList<>();

        Employee e1 = new Employee("Sambit",18,30000.0);
        Employee e2 = new Employee("Surya",25,50000.0);
        Employee e3 = new Employee("Manshi",35,90000.0);

        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        System.out.println("As is List of employees ");
        System.out.println(elist.toString());

        //increased salary of employees by 15% if age greater than 20
        List<Employee> incrementEList = elist.stream().map( e -> {
            if(e.getAge() >= 20)
            {
                e.setSalary(e.getSalary() * 1.15);
            }
            return e;
        }).collect(toList());
        //Salary after increment\
        System.out.println("Salary after increment");
        System.out.println(incrementEList.toString());

        //Sort descending (age)

        List<Employee> oldestFirst = elist.stream().sorted((s1,s2) -> {
            return s2.getAge() - s1.getAge();
        }).collect(Collectors.toList());

        System.out.println("Oldest employee first");
        System.out.println(oldestFirst.toString());
    }
}
