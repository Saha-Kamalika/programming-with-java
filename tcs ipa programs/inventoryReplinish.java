package xplore;

import java.util.Arrays;
import java.util.Scanner;
public class inventoryReplinish {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Inventory[] invent = new Inventory[4];
        for(int i=0;i<4;i++){
            invent[i]=new Inventory(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int limit=sc.nextInt();
        Inventory[] result = replenish(invent, limit);
        for(int i=0;i< result.length;i++){
            if (result[i].getThreshold() >= 75)
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            else if (result[i].getThreshold() >= 50 && result[i].getThreshold() <= 74)
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            else System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
        }
    }
    public static Inventory[] replenish(Inventory[] invent, int limit){
        Inventory[] refined=new Inventory[0];
        for(int i=0;i<invent.length;i++){
            if(invent[i].getThreshold()<=limit){
                refined= Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = invent[i];
            }
        }
        return refined;
    }
}
class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
}
