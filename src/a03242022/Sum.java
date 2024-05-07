package a03242022;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] givenArray = {1,2,3,4,5};
@SuppressWarnings("unused")
int total = 0;
int product = Integer.parseInt(args[0]);
for (int i=0; i<givenArray.length; i++) {
	total = givenArray[i];
	int sub = product - givenArray[i];
for( int x = i + 1; x < givenArray.length;x++ ) {
	if( givenArray[x] == sub) {
		System.out.println(givenArray[i] + " " + givenArray[x]);
	}
}
		}
	}
}