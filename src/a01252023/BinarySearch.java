package a01252023;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int j = 9;
		System.out.println(binarySearch(array, 0, array.length-1, j));
	}

	public static int binarySearch(int arr[],int firstIndex, int lastIndex, int givenElement) {

	    if (lastIndex >= firstIndex) {
	        int mid = firstIndex + (lastIndex - firstIndex)/2;

	        // If the element is present at the
	        // middle itself
	        if (arr[mid] == givenElement)
	            return mid;

	        // If element is smaller than mid, then
	        // it can only be present in left subarray
	        if (arr[mid] > givenElement)
	            return binarySearch(arr, firstIndex, mid -1, givenElement);

	        // Else the element can only be present
	        // in right subarray
	        return binarySearch(arr,mid + 1, lastIndex, givenElement);
	    }
	    return -1;
	}
}