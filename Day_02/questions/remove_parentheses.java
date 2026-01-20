import java.util.*;
import java.util.Stack;
public class remove_parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeOuterParentheses(str));
        sc.close();
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    ans.append(ch);
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
