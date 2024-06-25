package factory;

public class EmployeeType {
    public static Employee getEmployee(String emp){
        if(emp.trim().equalsIgnoreCase("ANDROID DEV")) return new AndroidDev();
        else if(emp.trim().equalsIgnoreCase("WEB DEV")) return new WebDev();
        else return null;
    }
}
