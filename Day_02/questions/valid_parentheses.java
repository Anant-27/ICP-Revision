import java.util.*;
import java.util.Stack;
public class valid_parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if((ch==')' && st.peek()=='(') ||
                    (ch=='}' && st.peek()=='{') ||
                    (ch==']' && st.peek()=='[')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}

