package Arrays2;

public class MergeSortedArray {
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, n, arr2, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void merge(long[] arr1, int m, long[] arr2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && arr1[p1] > arr2[p2]) {
                arr1[i--] = arr1[p1--];
            } else {
                arr1[i--] = arr2[p2--];
            }
        }
    }
}
