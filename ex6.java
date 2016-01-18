import java.io.* ;
import java.util.Scanner ;

class CoffeeAverage1 {

	public static void main ( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int amount = scan.nextInt();
		float x;
		float[] data = new float[amount];
		float sum = 0;

		for (int j = 0; j < amount; j++) {
			x = scan.nextFloat();
			System.out.println("data[ " + j + " ] = " + x);
			data[j] = x;
			sum += x;
		}
		float avg = sum / amount;
		System.out.println("average: " + avg);

		float far = data[0];
		for (int j = 0; j < data.length; j++) {
			if (Math.abs(data[j] - avg) > Math.abs(far - avg)) {
				far = data[j];
			}
		}
		System.out.println("most distant value: " + far);
		System.out.println("new average: " + (sum - far) / (amount - 1));
	}
}