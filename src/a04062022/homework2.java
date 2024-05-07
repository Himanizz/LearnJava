package a04062022;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] nums = {1, 2, 3, 4, 5, 6};
 int targ = 77;
 System.out.println(targetInd(nums, targ));
 
	}
	static int targetInd(int[] nums, int targ) {
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == targ) {
				num = i;
				break;
			}
			else if (nums[i] > targ) {
				num = i;
				break;
			}
			else {
				return -1;
			}
		}
		return num;
		
	}
}
