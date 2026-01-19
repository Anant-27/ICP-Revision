import java.util.*;
import java.util.Stack;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse(str));
        sc.close();
    }
    public static String reverse(String S){ 
        Stack<Character> st=new Stack<>();
        for(char ch:S.toCharArray()){
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
