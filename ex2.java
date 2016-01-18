import java.io.* ;

class TwoLargest {

	public static void main ( String[] args ) {
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int max = 0;
		int max2 = 0;

		for ( int index =  0; index < data.length; index ++) {
			int ele = data[index];
			if (ele > max) {
				max = ele;
			}
			if (ele < max && ele > max2) {
				max2 = ele;
			}
		}
		System.out.println(max + " " + max2);
	}
}