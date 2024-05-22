package xplore;

import java.util.Scanner;
public class lastChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(Character.isWhitespace(ch[i]) && !Character.isDigit(ch[i-1]) && !Character.isWhitespace((ch[i-1]))){
//                System.out.print(ch[i-1]);
//            }
//            else if(i==ch.length-1 && !Character.isDigit(ch[i])) System.out.print(ch[i]);
//        }
//        System.out.println();

        int n=ch.length;
        int i=0;
        while(i<n){
            while(i<n && ch[i]==' ') i++;
            if(i>=n) break;
            int j=i+1;
            while(j<n && ch[j]!=' ') j++;
            if((ch[j-1]>='a' && ch[j-1]<='z') || (ch[j-1]>='A' && ch[j-1]<='Z')){
                System.out.print(ch[j-1]);
            }
            i=j+1;
        }
    }
}
