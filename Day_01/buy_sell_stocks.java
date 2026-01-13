import java.util.*;
public class buy_sell_stocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(helper(n,arr));
        sc.close();
    }
    public static int helper(int n,int[] prices){
        int maxP=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                maxP=Math.max(maxP,prices[i]-buy);
            }
        }
        return maxP;
    }
}
