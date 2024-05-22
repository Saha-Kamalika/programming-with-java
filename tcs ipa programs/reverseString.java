package xplore;

import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}
