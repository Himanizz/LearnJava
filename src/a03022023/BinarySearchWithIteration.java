package a03022023;

public class BinarySearchWithIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;
		
		while(low<= high) {
			int mid = low + ((high-low)/2);
			if(sortedArray[mid]<key) {
				low = mid+1;
			}
			else if(sortedArray[mid] > key) {
				high  = mid -1;
			}
			else if (sortedArray[mid] == key) {
				index = mid;
				break;		
			}
		}
		return index;
	}

}
