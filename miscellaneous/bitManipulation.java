package classFiles;
import java.util.*;
/*
GET---- bit mask -> 1<<i
        AND
SET---- bit mask -> 1<<i
        OR
CLEAR---- bit mask -> 1<<i
           AND with NOT
UPDATE ----- for 1: set
             for 0: clear
 */
public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while (true) {
            System.out.println("Enter 1 to GET\nEnter 2 to SET\nEnter 3 to CLEAR\nEnter 4 to UPDATE\nEnter 5 to exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the position: ");
                    int pos = sc.nextInt();
                    if (((1 << pos) & n) == 1)
                        System.out.println("The bit was 1");
                    else System.out.println("The bit was 0");
                    break;

                case 2:
                    System.out.println("Enter the position: ");
                    int p = sc.nextInt();
                    int newNum = ((1 << p) | n);
                    System.out.println(newNum);
                    break;
                case 3:
                    System.out.println("Enter the position: ");
                    int p1 = sc.nextInt();
                    int cNum = ((1 << p1) & ~(n));
                    System.out.println(cNum);
                    break;
                case 4:
                    System.out.println("for 1: set\nfor 0: clear");
                    int c = sc.nextInt();
                    System.out.println("Enter the position: ");
                    int p2 = sc.nextInt();
                    if (c == 1) {
                        int nNum = ((1 << p2) | n);
                        System.out.println(nNum);
                    } else {
                        int clNum = ((1 << p2) & ~(n));
                        System.out.println(clNum);
                    }
                    break;
                case 5:
                    System.out.println("Exitting....");
                    System.exit(0);
            }
        }
    }
}
