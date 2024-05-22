import java.util.Scanner;

public class footwearCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //sc.nextLine(); // consume the newline character after nextInt()
        Footwear[] foots = new Footwear[5];

        for(int i = 0; i < 5; i++){
            int id = sc.nextInt();
            sc.nextLine(); // consume the newline character left by nextInt()
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine(); // consume the newline character left by nextInt()
            foots[i] = new Footwear(id, name, type, price);
        }

        String type1 = sc.nextLine(); // read the type for counting

        int ans = getCountByType(foots, type1);
        if(ans == 0) {
            System.out.println("Footwear not available");
        } else {
            System.out.println(ans);
        }
    }

    public static int getCountByType(Footwear[] foots, String type){
        int ans = 0;
        for(Footwear footwear : foots){
            if(footwear.getFootwearType().equalsIgnoreCase(type)) {
                ans++;
            }
        }
        return ans;
    }
}

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price){
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId(){
        return footwearId;
    }

    public String getFootwearName(){
        return footwearName;
    }

    public String getFootwearType(){
        return footwearType;
    }

    public int getPrice(){
        return price;
    }

    public void setFootwearId(int footwearId){
        this.footwearId = footwearId;
    }

    public void setFootwearName(String footwearName){
        this.footwearName = footwearName;
    }

    public void setFootwearType(String footwearType){
        this.footwearType = footwearType;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
/*
*
*
* Create a class Footwear which consists of the below attributes.



  footwearId=int

  footwearName=String

  footwearType=String

  price =int



the above attributes should be private.

write getter and setter and parametrised constructor as required.



create the class footwearProgram with the main method.

implement the 1 static methods.getCountByType in the Solution class.





getCountByType method:

   this method will take two input parameters.

array of the Footwear objects and string parameter footwear type.

this method will return the count of the footwears from array of the

footwear objects for the given type of footwear.

if no footwear with the given footwear type is found in the

array of footwear abjects,then the method should return 0.



for getCountByType method- the main method should print the count of the footwears ,if the returned value

is greater than zero. or it should print "Footwear not available";

*/