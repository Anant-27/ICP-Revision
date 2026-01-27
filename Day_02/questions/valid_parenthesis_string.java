import java.util.*;

public class valid_parenthesis_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(checkValidString(s));
        sc.close();
    }
    public static boolean checkValidString(String s) {
        int n=s.length();
        Boolean[][] dp=new Boolean[n+1][n+1];
        return helper(s,0,0,dp);
    }
    public static  boolean helper(String str,int idx,int count,Boolean[][] dp){
        if(idx==str.length()){
            return count==0;
        }
        if(count<0){
            return false;
        }
        if(dp[idx][count]!=null){
            return dp[idx][count];
        }
        if(str.charAt(idx)=='('){
            return helper(str,idx+1,count+1,dp);
        }
        else if(str.charAt(idx)==')'){
            return helper(str,idx+1,count-1,dp);
        }
        else{
            return dp[idx][count]=(helper(str,idx+1,count,dp) || helper(str,idx+1,count+1,dp) || helper(str,idx+1,count-1,dp));
        }
    }

}
