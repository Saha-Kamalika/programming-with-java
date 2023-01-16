import java.util.Random;
import java.util.Scanner;
class random{
    int r,input,guess=1;
    Scanner sc=new Scanner(System.in);
    public random() {
        Random rand = new Random();
        r = rand.nextInt(100);
        System.out.println("Guess number between 1-100: ");
    }
    public void takeUserInput()
    {
        input=sc.nextInt();
    }
    public void setGuess(){
            guess++;
    }
    public int getGuess(){
        return guess;
    }
    public void isCorrectNumber(){
        if(input==r)
            System.out.println("You guess the correct number!");
    }
}
public class guessGame {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        random rand=new random();
        rand.takeUserInput();
        while(rand.r!=rand.input){
            if(rand.r>rand.input){
                System.out.println("Enter bigger number: ");
            }
            else
                System.out.println("Enter smaller number: ");
            System.out.println("Try again!!");
            rand.setGuess();
            rand.takeUserInput();
        }
        rand.isCorrectNumber();
        System.out.println("No of guesses: "+rand.getGuess());

    }
}
