

public class NextPermutation {
    public static void main(String[] args) {
        int ans[] = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(ans);

        for(int i: ans){
            System.out.print(i+" ");
        }
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        if(nums == null || n <= 1)return;

        int i= n-2;
        while(i >=0 && nums[i] >= nums[i+1])i--;

        if(i >=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j){
        while(i<j) swap(nums, i++, j--);
    }
}
