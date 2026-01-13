import java.util.*;
public class count_primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(helper(n));
        sc.close();
    }
    public static int helper(int n){
        if(n<2){
            return 0;
        }
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                continue;
            }
            else{
                for(int j=i+i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==true){
                count++;
            }
        }
        return count;
    }
}
