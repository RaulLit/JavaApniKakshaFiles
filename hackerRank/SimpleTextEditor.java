package hackerRank;
import java.util.*;

public class SimpleTextEditor {
    
    public static Stack <String> stack = new Stack<>();
    
    public static void append(String s) {
        if(stack.isEmpty()) {
            stack.push(s);
        } else{
            stack.push(stack.peek() + s);
        }
    }
    
    public static void delete(int k) {
        String temp = stack.peek();
        if(k == temp.length()) {
            stack.push("");
        } else {
            stack.push(temp.substring(0, temp.length()-k));
        }
    }
    
    public static void print(int k) {
        System.out.println(stack.peek().charAt(k-1));
    }
    
    public static void undo() {
        stack.pop();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        
        for(int i = 0; i < Q; i++) {
            int op = sc.nextInt();
            switch(op) {
                
                case 1:
                String toAddString = sc.next();
                append(toAddString);
                break;
                
                case 2:
                int toDelete = sc.nextInt();
                delete(toDelete);
                break;
                
                case 3:
                int toPrint = sc.nextInt();
                print(toPrint);
                break;
                
                case 4:
                undo();
                break;
            }
            System.out.println(stack.peek());
        }
        
    }
}