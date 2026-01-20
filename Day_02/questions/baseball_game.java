import java.util.*;
import java.util.Stack;
public class baseball_game {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String[] arr=new String[n]; 
       for(int i=0;i<n;i++){
        arr[i]=sc.next();
       }
       System.out.println(game(arr));
       sc.close();
    }
    public static int game(String[] opr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<opr.length;i++){
            String str=opr[i];
            if(str.equals("C")){
            st.pop();
            }
            else if(str.equals("D")){
                st.push(st.peek()*2); 
            }
            else if(str.equals("+")){
                int top=st.pop();
                int score=top+st.peek();
                st.push(top);
                st.push(score);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }
        return sum;
    }
}
