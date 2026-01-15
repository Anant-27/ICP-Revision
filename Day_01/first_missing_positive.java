import java.util.*;
public class first_missing_positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
        sc.close();
        
    }
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>=(n+1)){
                nums[i]=n+1;
            }
        }
        // Mark visited:-
        for(int i=0;i<n;i++){
            int element=Math.abs(nums[i]);
            if(element==n+1){
                continue;
            }
            int seat=element-1;
            if(nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                return i+1;
            }
        }
        return (n+1);
    }
    // public static int firstMissingPositive(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int i=0;i<nums.length;i++) {
    //         if (nums[i] > 0){
    //             set.add(nums[i]);
    //         }
    //     }
    //     int val = 1;
    //     while (set.contains(val)) {
    //         val++;
    //     }
    //     return val;
    // }   
}
