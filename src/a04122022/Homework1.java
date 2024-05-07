package a04122022;
import java.util.Arrays;
public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {2, 7, 11, 15};
		int target = 13;
		checker(nums, target);
	
	}
	
 static void checker(int nums[],int  target) {
	 int[] abc=new int[2];
	 for (int x = 0; x < nums.length; x++) {
	 for (int i = 0; i < nums.length; i++) {
		 if(nums[i] + nums[x] == target) {
			 //System.out.println(i + " " + x);
			 abc[0]=i;
			 abc[1]=x;
			 break;
		 }
	 }
 }
	 System.out.println(abc[0] + " " + abc[1]);
 }
}
