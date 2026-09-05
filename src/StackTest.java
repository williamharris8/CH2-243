import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");

        System.out.println("Top of stack: " + myStack.peek());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }



    }
}
