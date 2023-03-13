package classFiles;
public class stringBRev {
    public static void main(String[] args){
        StringBuilder name=new StringBuilder("kamalika");
        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;
            char f=name.charAt(front);
            char b=name.charAt(back);
            name.setCharAt(front,b);
            name.setCharAt(back,f);
        }
        System.out.println("Reversed String: "+name);
    }
}
