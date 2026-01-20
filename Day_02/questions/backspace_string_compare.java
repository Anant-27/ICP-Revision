import java.util.*;
import java.util.Stack;
public class backspace_string_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(backspaceCompare(s1,s2));
        sc.close();
    }
    public static boolean backspaceCompare(String s, String t) {
      String s1=helper(s);
      String s2=helper(t);
      return s1.equals(s2);
    }
    public static String helper(String str){
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        for(char ch:st){
            ans.append(ch);
        }
        return ans.toString();
    }
}
