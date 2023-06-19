import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
     public static List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int elm1 = Integer.MIN_VALUE, elm2 = Integer.MIN_VALUE;
        int n = nums.length; 

        for(int i=0; i<n; i++){
            if(cnt1 == 0 && elm2 != nums[i]){
                cnt1 = 1;
                elm1 = nums[i];
            }else if(cnt2 == 0 && elm1 != nums[i]){
                cnt2 = 1;
                elm2 = nums[i];
            }else if(elm1 == nums[i]){
                cnt1++;
            }else if(elm2 == nums[i]){
                cnt2++;
            }else {
                cnt1--; cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i] == elm1)cnt1++;
            if(nums[i] == elm2)cnt2++;
        }

        if(cnt1 > (n/3)) ans.add(elm1);
        if(cnt2 > (n/3)) ans.add(elm2);
        
        return ans;
    }
}
