package xplore;

import java.util.*;
public class perfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sq = Math.sqrt(n);
        if((int)sq==sq){
            System.out.println("TRUE");
        }
        else System.out.println("FALSE");
    }
}
