package xplore;

import java.util.Scanner;

public class travelAgency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Agency[] agencies=new Agency[4];
        for(int i=0;i<4;i++){
            int regNo = sc.nextInt();
            sc.nextLine(); //to consume the newline character
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            agencies[i] = new Agency(regNo, agencyName, packageType, price, flightFacility);
        }
        int highest=findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highest);
        int regNo=sc.nextInt();
        sc.nextLine();
        String packageType=sc.nextLine();
        Agency ans=agencyDetailsForGivenIdAndType(agencies, regNo, packageType);
        if(ans!=null){
            System.out.println(ans.getAgencyName()+":"+ans.getPrice());
        }
        else System.out.println("Not available");
    }
    public static int findAgencyWithHighestPackagePrice(Agency[] agencies){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<agencies.length;i++){
            if(agencies[i].getPrice()>max) max=agencies[i].getPrice();
        }
        return max;
    }
    public static Agency agencyDetailsForGivenIdAndType(Agency[]  agencies, int regNo, String packageType){
        Agency ans=null;
        for(int i=0;i<agencies.length;i++){
            if(agencies[i].isFlightFacility() && agencies[i].getRegNo()==regNo && agencies[i].getPackageType().equalsIgnoreCase(packageType)){
                ans=agencies[i];
                return ans;
            }
        }
        return null;
    }
}
class Agency{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public int getRegNo(){
        return regNo;
    }
    public void setRegNo(int regNo){
        this.regNo=regNo;
    }
    public String getAgencyName(){
        return agencyName;
    }
    public void setAgencyName(String agencyName){
        this.agencyName=agencyName;
    }
    public String getPackageType(){
        return packageType;
    }
    public void setPackageType(String packageType){
        this.packageType=packageType;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public boolean isFlightFacility(){
        return flightFacility;
    }
    public void setFlightFacility(boolean flightFacility){
        this.flightFacility=flightFacility;
    }

    public Agency(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
}
