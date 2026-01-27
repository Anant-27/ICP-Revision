import java.util.*;
import java.util.Stack;
public class nge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        int [] result=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge=nextGreater(nums2);
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=nge[nums1[i]];
        }
        return result;
    }
    public static int[] nextGreater(int[] nums){
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[10000+1];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            nge[nums[i]]=(st.isEmpty()?-1:st.peek());
            st.push(nums[i]);
        }
        return nge;
    }
}

