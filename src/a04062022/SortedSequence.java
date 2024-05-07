package a04062022;
import java.util.Arrays;
public class SortedSequence {

	public static void main(String[] args) {
		int[] array = {4, 5, 6, 2, 1};
		longestSortedSequence(array);
	}
	
	public static int longestSortedSequence(int [] checkMe){
		int countA = 0;
		int countB = 0;
		 if(checkMe.length==0)
		    {
		    return 0;
		    }
		 else if(checkMe.length==1){
			 return 1;
		 }
		    else{
		for(int i = 1; i < checkMe.length; i++) {
			//System.out.println(checkMe[i]);
			if (checkMe[i] > checkMe[i-1]) {
				countA = countA + 1;
				//countB = 0;
			}
			else {
				if (countB < countA) {
					countB = countA;
					countA = 0;
				}
			}
		}
		if(countA>countB)
		{
			System.out.println(countA+1);	
		}
		System.out.println(countB-1);	
		return countA >countB? countA:countB;
	}
	}

}
