package xplore;

import java.util.Arrays;
import java.util.Scanner;

public class simProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sim[] sims=new Sim[4];
        for(int i=0;i<4;i++){
            sims[i]=new Sim(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        }
        String search_circle=sc.next();
        double search_rate=sc.nextDouble();

        Sim[] result = matchAndSort(sims, search_circle, search_rate);
        for(int i=0;i< result.length;i++){
            System.out.println(result[i].getId());
        }
    }
    public static Sim[] matchAndSort(Sim[] sims, String search_circle, double search_rate){
        Sim[] refined=new Sim[0];
        for(int i=0;i<sims.length;i++){
            if(sims[i].getCircle().equals(search_circle) && sims[i].getRatePerSecond()<search_rate){
                refined= Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1]=sims[i];
            }
        }
        for(int i=0;i<refined.length-1;i++){
            for(int j=0;j<refined.length-i-1;j++){
                if(refined[j].getBalance()<refined[j+1].getBalance()){
                    Sim temp=refined[j];
                    refined[j]=refined[j+1];
                    refined[j+1]=temp;
                }

            }
        }
        return refined;
    }
}
class Sim{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
}
/*
* Create class xplore.Sim with below attributes: id - int company - String balance - int ratePerSecond - double circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class. This method will take array of xplore.Sim objects, search_circle String and search_rate double as parameters. And will return another xplore.Sim array where the search_circle matches with the circle parameter of the original xplore.Sim array and the search_rate double is greater than the original array of xplore.Sim object's ratePerSecond attribute which is also sorted by means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four xplore.Sim objects referring the attributes in above sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in main method to print the id's of the result obtained.*/