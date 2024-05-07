package a04262023;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,18,19,2,4,3,50,10};
MergeSort ms = new MergeSort();
ms.sort(arr, 0, arr.length-1);
printArray(arr);

	}
	 void merge(int arr[], int l, int m, int r){
		 int part1 = m - l + 1;
	     int part2 = r - m;
	     	int L[] = new int[part1];
	     	int R[] = new int[part2];
	     		for (int i = 0; i < part1; ++i)
	            L[i] = arr[l + i];
	     		for (int j = 0; j < part2; ++j)
	            R[j] = arr[m + 1 + j];
	     int j = 0;
	     int i = 0;
	     int temp = 1;
	     while(i < part1 && j < part2) {
	    	 if(L[i] <= R[j]) {
	    		 arr[temp] = L[i];
	    		 i++;
	    	 }
	    	 else {
	    		 arr[temp] = R[j];
	    		 j++;
	    	 }
	    	 temp++;
	    	 }
	     while(i < part1) {
	    	 arr[temp] = L[i];
	    	 i++;
	    	 temp++;
	     }
	     while(j < part2) {
	    	 arr[temp] = R[j];
	    	 i++;
	    	 temp++;
	     }
	 }
	 void sort(int arr[], int l, int r){
	        if (l < r) {
	            int m = l + (r - l) / 2;
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	            merge(arr, l, m, r);
	        }
	    }
	    static void printArray(int arr[])
	    {
	        int x = arr.length;
	        for (int i = 0; i < x; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
}
