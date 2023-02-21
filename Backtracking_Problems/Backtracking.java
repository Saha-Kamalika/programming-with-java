package classFiles;
public class Backtracking {
    public static void permutation(String str,String per,int index){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        int i;
        for(i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newS=str.substring(0,i)+str.substring(i+1); //new String except the fixed character
            permutation(newS,per+curr,index+1);
        }
    }
    public static void main(String args[])
    {
        permutation("ABC","",0); //A is taken fixed at first
    }
}
