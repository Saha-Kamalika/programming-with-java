package xplore;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone1[] ph=new Phone1[4];
        for(int i=0;i<ph.length;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String os=sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            ph[i]=new Phone1(id,os,brand,price);
        }
        String brand1=sc.nextLine();
        String os1=sc.nextLine();

        int ans=findPriceOfGivenBrand(ph,brand1);
        if(ans==0) System.out.println("The given brand is not available");
        else System.out.println(ans);

        Phone1 res=getPhoneIdBasedOnOs(ph,os1);
        if(res!=null) System.out.println(res.phoneId);
        else System.out.println("No phones are available with specified os and price range");
    }
    public static int findPriceOfGivenBrand(Phone1[] ph,String brand){
        int ans=0;
        for(int i=0;i<ph.length;i++){
            if(ph[i].brand.equalsIgnoreCase(brand)) ans+=ph[i].price;
        }
        return ans;
    }
    public static Phone1 getPhoneIdBasedOnOs(Phone1[] ph,String os){
        for(int i=0;i<ph.length;i++){
            if(ph[i].os.equalsIgnoreCase(os) && ph[i].price>=50000) return ph[i];
        }
        return null;
    }
}
class Phone1{
    int phoneId;
    String os;
    String brand;
    int price;
    public Phone1(int phoneId,String os,String brand, int price){
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
}