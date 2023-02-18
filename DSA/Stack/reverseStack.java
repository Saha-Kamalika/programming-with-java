package classFiles;
import java.util.Stack;
public class reverseStack {
    public static Stack<Integer> reverseS(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();
        int i;
        for (i = s1.size() - 1; i >= 0; i--)
            s2.push(s1.get(i));
        return s2;
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(50);
        System.out.println("Before reversal: "+s1);
        System.out.println("After reversal: "+reverseS(s1));
    }
}

