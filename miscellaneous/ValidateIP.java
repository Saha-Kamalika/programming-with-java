class Validate{
    public static boolean isValid(String str){
        try{
            int num=Integer.parseInt(str);
            if(num>=0 && num<=255) return true;
            else return false;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public static void main(String[] args){
    String s="120.43.21.c",str="";
    int j=0,i;
    for(i=0;i<s.length();i++){
        if(s.charAt(i)=='.'){
            str=s.substring(j,i);
            j=i+1;
            if(!isValid(str)){
                System.out.println("Invalid");
                return;
            }
        }
    }
    str=s.substring(j,i);
    if(!isValid(str)){
        System.out.println("Invalid");
        return;
    }
    System.out.println("Valid");
    }
}
//1. 192.100.200.2
//2. 300.150.43.1
//3. 120.43.21.c
