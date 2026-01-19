import java.util.*;

public class implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack st = new Stack(n);

        st.push(7);
        st.push(18);
        st.push(45);

        st.Display();

        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());

        st.Display();
        sc.close();
    }
}

class Stack {
    private int[] arr;
    private int idx = -1;

    public Stack() {
        arr = new int[5];
    }

    public Stack(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public boolean isFull() {
        return idx == arr.length - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        idx++;
        arr[idx] = item;  
    }

    public int size() {
        return idx + 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int rv = arr[idx];
        idx--;
        return rv;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty!");
            return -1;
        }
        return arr[idx];
    }

    public void Display() {
        for (int i = idx; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
