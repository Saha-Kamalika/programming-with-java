package xplore;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class uniqueChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        char[] ch=s.toCharArray();
        for(Character c: ch){
            hs.add(c);
        }
        for(Character c: hs){
            System.out.print(c);
        }
    }
}
