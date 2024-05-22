package xplore;
import java.util.Arrays;
import java.util.Scanner;
public class Veggies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vegetables[] veg=new Vegetables[4];
        for(int i=0;i< veg.length;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt();
            int rating=sc.nextInt();
            sc.nextLine();
            veg[i]=new Vegetables(id,name,price,rating);
        }
        int input=sc.nextInt();
        int ans=findPrice(veg,input);
        if(ans==-1) System.out.println("No Match Found");
        else System.out.println(ans);
    }
    public static int findPrice(Vegetables[] veg,int rating){
        int[] ans=new int[0];
        for(int i=0;i< veg.length;i++){
            if(veg[i].getRating()>rating){
                ans= Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=veg[i].getPrice();
            }
        }
        Arrays.sort(ans);
        if(ans.length==0) return -1;
        return ans[0];
    }
}
class Vegetables{
    private int vegetableId;
    private String vegetableName;
    private int price;
    private int rating;
    public Vegetables(int vegetableId,String vegetableName,int price,int rating){
        this.vegetableId=vegetableId;
        this.vegetableName=vegetableName;
        this.price=price;
        this.rating=rating;
    }
    public int getVegetableId(){return vegetableId;}
    public String getVegetableName(){return vegetableName;}
    public int getPrice(){return price;}
    public int getRating(){return rating;}

    public void setVegetableId(int vegetableId){
        this.vegetableId=vegetableId;
    }
    public void setVegetableName(String vegetableName){
        this.vegetableName=vegetableName;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
}
