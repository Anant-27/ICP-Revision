import java.util.Scanner;
import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int removed = stack.pop();
        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MinStack minStack = new MinStack();

        System.out.println("Operations:");
        System.out.println("1 x -> push(x)");
        System.out.println("2   -> pop()");
        System.out.println("3   -> top()");
        System.out.println("4   -> getMin()");
        System.out.println("0   -> exit");

        while (true) {
            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    int x = sc.nextInt();
                    minStack.push(x);
                    break;

                case 2:
                    minStack.pop();
                    break;

                case 3:
                    System.out.println(minStack.top());
                    break;

                case 4:
                    System.out.println(minStack.getMin());
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }

        sc.close();
    }
}
