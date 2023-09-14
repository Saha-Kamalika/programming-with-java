class IllegalAgeException extends Exception{
    IllegalAgeException(String str){
        super(str);
    }
}
class Test{
    static void eligible(int age) throws IllegalAgeException{
        if(age<18) throw new IllegalAgeException("You are not eligible to vote");
        else System.out.println("You are eligible to vote");
    }
    public static void main(String[] args){
        try{
            eligible(17);
        }catch(IllegalAgeException e){
            System.out.println("Exception occured "+e);
        }
        System.out.println("Code executed successfully");
    }
}
