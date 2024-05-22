package xplore;

import java.util.Scanner;

public class autonomousCar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car[] cars=new Car[4];
        for(int i=0;i<4;i++){
            cars[i]=new Car(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
        }
        String environment=sc.next();
        int res=findTestPassedByEnv(cars, environment);
        if(res>=0){
            System.out.println(res);
        }
        else System.out.println("There are no tests passed in this particular environment");

        String brand=sc.next();
        Car ans=updateCarGrade(cars, brand);
        if(ans!=null){
            System.out.println(ans.getBrand()+"::"+ans.getGrade());
        }
        else System.out.println("No xplore.Car is available with the specified brand");
    }
    public static int findTestPassedByEnv(Car[] cars, String enviroinment){
        int ans=0;
        for(int i=0;i< cars.length;i++){
            if(cars[i].getEnvironment().equalsIgnoreCase(enviroinment)){
                ans+=cars[i].getNoOfTestsPassed();
            }
        }
        return ans;
    }
    public static Car updateCarGrade(Car[] cars, String brand){
        Car temp=null;
        for(int i=0;i< cars.length;i++){
            if(cars[i].getBrand().equalsIgnoreCase(brand)){
                int rating=(cars[i].getNoOfTestsPassed()*100)/cars[i].getNoOfTestsConducted();
                if(rating>=80){
                    cars[i].setGrade("A1");
                }
                else cars[i].setGrade("B2");
                temp=cars[i];
                return temp;
            }
        }
        return null;
    }
}
class Car{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Car(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }
}
