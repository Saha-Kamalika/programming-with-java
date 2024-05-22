package xplore;

import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int vowel=0, conso=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') vowel++;
                else conso++;
            }
        }
        System.out.println("vowels: "+vowel+"\nconsonants: "+conso);
    }
}
