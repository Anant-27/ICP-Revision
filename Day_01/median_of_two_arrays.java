import java.util.*;
public class median_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(nums1,nums2));
        sc.close();
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int len=arr.length;
        if(len%2==0){
             return (arr[len/2]+arr[len/2-1])/2.0;
        }
        else{
            return (double)arr[len/2];
        }
    }
}
