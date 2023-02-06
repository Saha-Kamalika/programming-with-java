import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return "This is an exception";
    }
    public String getMessage(){
        return "Exception has occurred";
    }
}
public class cusExcep {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter your input: ");
            n = sc.nextInt();
            if (n < 50) {
                try {
                    throw new MyException();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                }
            }
            else {
                System.out.println("Correct input");
                flag = false;
            }
        }
    }
}
