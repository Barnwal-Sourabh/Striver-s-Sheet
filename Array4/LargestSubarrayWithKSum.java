import java.util.*;

public class LargestSubarrayWithKSum {

	private static int maxLen(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int maxLen = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum == 0) {
				maxLen = i + 1;
			} else {
				if (map.containsKey(sum)) {
					maxLen = Math.max(maxLen, i - map.get(sum));
				} else {
					map.put(sum, i);
				}

			}
		}

		return maxLen;
	}

	public static void main(String args[]) {
		int a[] = { 9, -3, 3, -1, 6, -5 };
		System.out.println(maxLen(a, a.length));
	}
}