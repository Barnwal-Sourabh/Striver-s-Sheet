/**
 * MajorityElement
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int elem = 0;
        for(int i=0; i<n; i++){
            if(count ==  0){
                count = 1;
                elem = nums[i];
            }else if(elem == nums[i]){
                count++;
            }else {
                count--;
            }
        }

        int count1 = 0;

        for(int i: nums){
            if(i == elem){
                count1++;
            }
        }

        if(count1 > (n/2)){
            return elem;
        }

        return -1;
    }
}
