import java.util.*;
import java.util.Stack;
public class remove_middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        remove_middle obj = new remove_middle();
        obj.deleteMid(s);

        System.out.println(s);
        sc.close();
    }

    public void deleteMid(Stack<Integer> s) {
        int size = s.size();
        ArrayList<Integer> ll = new ArrayList<>();

        while (!s.isEmpty()) {
            ll.add(s.pop());
        }

        int mid = size / 2;
        int indexToRemove = size - 1 - mid; 
        ll.remove(indexToRemove);

        for (int i = ll.size() - 1; i >= 0; i--) {
            s.push(ll.get(i));
        }
    }
}
