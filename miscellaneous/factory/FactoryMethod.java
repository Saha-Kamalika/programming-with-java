package factory;
interface Employee{
    int salary();
}
class AndroidDev implements Employee{
    public int salary(){
        System.out.println("ANDROID DEVELOPER");
        return 50000;
    }
}
class WebDev implements Employee{
    public int salary(){
        System.out.println("WEB DEVELOPER");
        return 40000;
    }
}
public class FactoryMethod{
    public static void main(String[] args){
        Employee emp=EmployeeType.getEmployee("ANDROID DEV");
        System.out.println(emp.salary());
        Employee emp1=EmployeeType.getEmployee("WEB DEV");
        System.out.println(emp1.salary());
    }
}

/*
* factory design pattern: creates an interface for creating objects and lets the subclasses decide which class to instantiate
* used to achieve loose coupling
* */