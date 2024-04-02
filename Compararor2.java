import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Comparator2{ 
  public static void main(String[] args) {
    List<Employee> emp=new ArrayList<>();
    emp.add(new Employee(1,33));
    emp.add(new Employee(2,50));
    emp.add(new Employee(3,71));

    Comparator<Employee> com=new Comparator<>(){
      public int compare(Employee e1,Employee e2){
        return e1.salary>e2.salary?-1:e1.salary<e2.salary?1:0;
      }
    };
    Collections.sort(emp,com);
    for(Employee e:emp){
      System.out.println(e);
    }
  }
}
class Employee{
  int id;
  double salary;
  public Employee(int id,double salary){
    this.id=id;
    this.salary=salary;
  }
  public String toString(){
    return "Employee(id: "+id+", salary: "+salary+")";
  }
}
