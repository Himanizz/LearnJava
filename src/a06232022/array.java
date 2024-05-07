package a06232022;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int [] list = {2,8,7,3,5,6,9,1,4,10};
		for  (int i = 0; i <= list.length; i++) {
			for(int x = i+1; x <= list.length - 1; x++) {
				if(list[i] + list[x] == 10) {
					System.out.println("i.." + list[i]);
					System.out.println("x.." + list[x]);
				}
			}
		}
	}
}
