package xplore;

import java.util.Scanner;

public class smallestVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u'|| ch[i]=='i'){
                int ascii= ch[i];
                if(ascii<min){
                    min=ascii;
                }
            }
        }
        System.out.println((char)min);
        /*
        * String []vowels={"a","e","i","o","u"};
        for(int i=0;i<vowels.length;i++){
            if(word.contains(vowels[i])){
                System.out.println(vowels[i]);
                break;
            }
        }        */
    }
}
