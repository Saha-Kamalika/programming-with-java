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

/*
import java.util.*;
public class MyStack{
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverse(s);
        System.out.println("Reversed Stack: ");
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}*/
