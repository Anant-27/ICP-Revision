import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<List<Integer>> list=threeSum(nums);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(0).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        sc.close();

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(j>i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                if(k<n-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);         
                    temp.add(nums[j]);         
                    temp.add(nums[k]); 
                    ans.add(new ArrayList<>(temp));
                    j++;
                    k--;        
                }
            }
        }
        return ans;
    }
}
