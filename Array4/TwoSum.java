package Array4;

/**
 * TwoSum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int gap = 1;
        int[] res = new int[2];
        while (true) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                break;
            } else if (j == n - 1) {
                gap++;
                i = 0;
                j = gap;
            } else {
                i++;
                j++;
            }
        }
        return res;
    }
}
