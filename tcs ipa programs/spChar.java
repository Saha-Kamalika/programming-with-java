package xplore;

import java.util.*;
public class spChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int len=s.length(), sp=0, c=0;
//        for(int i=0;i<len;i++){
//            if(s.charAt(i)==' ') sp++;
//        }
//        System.out.println(sp+" "+(len-sp));
        char[] ch = s.toCharArray();
        for(int i=0;i<len;i++){
            if(Character.isWhitespace(ch[i])) sp++;
            else if(!Character.isDigit(ch[i])) c++;
        }
        System.out.println("Spaces: "+sp+" "+"Characters: "+c);
    }
}
