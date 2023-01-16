import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor_game {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ycount=0,ccount=0,i=1;
    System.out.println("WELCOME TO THE ROCK PAPER SCISSOR GAME\nThis game consist of 5 rounds\nI will be your competitor!!\nLET'S START!");
    for(i=1;i<=5;i++) {
            System.out.print("Choose 0 for Rock, 1 for Paper, 2 for Scissor....");
            int c = sc.nextInt();
            Random r=new Random();
            System.out.print("Computer's turn...");
            int cc = r.nextInt(3);
            System.out.println(cc);
            if (cc == 0 && c == 0 || cc == 1 && c == 1 || cc == 2 && c == 2)
                continue;
            else if (cc == 0 && c == 1)
                ycount++;
            else if (cc == 1 && c == 0)
                ccount++;
            else if (cc == 0 && c == 2)
                ccount++;
            else if (cc == 2 && c == 0)
                ycount++;
            else if (cc == 1 && c == 2)
                ycount++;
            else if (cc == 2 && c == 1)
                ccount++;
        }
        if(ccount==ycount)
            System.out.println("Its a draw");
        else if(ccount<ycount)
            System.out.println("Congratulations, You Won!\nYour Score: "+ycount+ " My Score: "+ccount);
        else
            System.out.println("Sorry, You Lose!\n Your Score: "+ycount+ " My Score: "+ccount);
    }
}


