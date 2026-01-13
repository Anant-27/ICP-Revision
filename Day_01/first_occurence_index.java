import java.util.*;
public class first_occurence_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(helper(s1,s2));
        sc.close();
    }
    public static int helper(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int i=0;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(0) && i+m-1<n && s1.substring(i,i+m).equals(s2)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
