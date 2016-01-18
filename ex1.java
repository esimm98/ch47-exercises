import java.io.* ;

class ThreeSums {
	public static void main ( String[] args ) {
		int [] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

		int sum = 0;
		int evens = 0;
		int odds = 0;

		for ( int index = 0; index < data.length; index ++) {
			int ele = data[index];
			sum += ele;
			if (ele % 2 == 0) {
				evens += ele;
			} else {
				odds += ele;
			}
		}
		System.out.println("Sum = " + sum);
		System.out.println("Evens Sum = " + evens);
		System.out.println("Odds Sum = " + odds);
	}
}