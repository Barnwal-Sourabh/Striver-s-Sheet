package Arrays2;

import java.util.*;

public class MergeIntervals {
	public static void main(String[] args) {
		int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 12, 14 } };

		int ans[][] = merge(intervals);

		for (int arr[] : ans) {
			for (int e : arr) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	// Brute force solution
	public int[][] merge1(int[][] intervals) {
		List<int[]> res = new ArrayList<>();

		if (intervals.length == 0 || intervals == null) {
			return res.toArray(new int[0][]);
		}

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int start = intervals[0][0], end = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			int s = intervals[i][0];
			int e = intervals[i][1];

			if (s <= end) {
				end = Math.max(e, end);
			} else {
				res.add(new int[] { start, end });
				start = s;
				end = e;
			}
		}

		res.add(new int[] { start, end });

		return res.toArray(new int[0][]);
	}

	// optimize solution
	public static int[][] merge(int[][] intervals) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < intervals.length; i++) {
			min = Math.min(min, intervals[i][0]);
			max = Math.max(max, intervals[i][0]);
		}

		int[] range = new int[max - min + 1];
		for (int i = 0; i < intervals.length; i++) {
			range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]);
		}

		int start = 0, end = 0;
		LinkedList<int[]> result = new LinkedList<>();
		for (int i = 0; i < range.length; i++) {
			if (range[i] == 0) {
				continue;
			}
			if (i <= end) {
				end = Math.max(range[i], end);
			} else {
				result.add(new int[] { start + min, end + min });
				start = i;
				end = range[i];
			}
		}
		result.add(new int[] { start + min, end + min });
		return result.toArray(new int[result.size()][]);
	}
}
