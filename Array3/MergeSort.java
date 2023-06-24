import java.util.*;

public class MergeSort {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }

    public static void printArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        MergeSort.mergeSort(input, 0, input.length - 1);
        printArray(input);
    }

    public static void mergeSort(int[] input, int sI, int eI){
        if(sI >= eI){
            return;
        }
    	    int mid = (sI + eI)/2;
            mergeSort(input, sI, mid);
            mergeSort(input, mid+ 1, eI);
            merge(input, sI, eI);
        
    }
	public static void merge(int[] input, int sI, int eI){
        int mid = (sI + eI)/2;
        int i = sI;
        int j = mid+1;
        int k = 0;
        int ans[] = new int[eI - sI + 1];
        while(i <= mid && j <= eI ){
            if(input[i] < input[j]){
                ans[k] = input[i];
                i++;
                k++;
            }else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }
    
            while(j <= eI){
                ans[k] = input[j];
                j++; k++;
            }
    
            while(i <= mid){
                ans[k] = input[i];
                i++; k++;
            }
        
        
        for(int index = 0; index < ans.length; index++){
            input[index + sI] = ans[index];
        }
        
    }
   
    
	public static void mergeSort(int[] input){
		mergeSort(input, 0, input.length - 1);
        
	}
}
