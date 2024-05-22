package xplore;

import java.util.Scanner;

public class deviceManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone[] phones=new Phone[4];
        for(int i=0;i<4;i++){
            phones[i]=new Phone(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }
        String brand=sc.next();
        String os= sc.next();
        int price=findPriceForGivenBrand(phones, brand);
        if(price==0){
            System.out.println("The given Brand is not available");
        }
        else System.out.println(price);

        Phone ans=getPhoneIdBasedOnOs(phones, os);
        if(ans==null){
            System.out.println("No phones are available with specified os and price range");
        }
        else{
            System.out.println(ans.getPhoneId());
        }
    }
    public static int findPriceForGivenBrand(Phone[] phones, String brand){
        int sum=0;
        for(int i=0;i<phones.length;i++){
            if(phones[i].getBrand().equalsIgnoreCase(brand)){
                sum+= phones[i].getPrice();
            }
        }
        if(sum>0) return sum;
        else return 0;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os){
        Phone ans=null;
        for(int i=0;i< phones.length;i++){
            if(phones[i].getOs().equalsIgnoreCase(os) && phones[i].getPrice()>=50000){
                ans=phones[i];
                return ans;
            }
        }
        return null;
    }
}
class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}
