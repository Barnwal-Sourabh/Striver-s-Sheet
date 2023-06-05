
public class SortArray012 {

    public static void main(String[] args) {
        int ans[] = {2, 1, 2, 2, 1, 0, 0};
        sortColors(ans);

        for(int i: ans){
            System.out.print(i+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else {
                swap(nums, mid, high);
                high--;
            }
        }

        
    }

    public static void swap(int nums[], int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}