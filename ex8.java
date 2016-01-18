import java.io.* ;
import java.util.Scanner ;

class CoffeeAverage3 {

	public static void main ( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int amount = scan.nextInt();
		float[] data = new float[amount];
		float[] fars = new float[amount];
		float[] avgs = new float[amount];
		float[] diffs = new float[amount];
		float sum = 0;
		float farTotal = 0;
		int index = 0;

		for (int j = 0; j < amount; j++) {
			float x = scan.nextFloat();
			data[j] = x;
			sum += x;
		}

		for (int i = 0; i < amount - 1; i++) {
			farTotal = 0;
			for (int k = 0; k < i; k++) {
				farTotal += fars[k];
			}
			avgs[i] = (sum - farTotal) / (amount - i);

			for (int k = 0; k < amount; k++) {
				diffs[k] = Math.abs(data[k] - avgs[i]);
			}

			for (int k = 0; k <= i; k++) {
				fars[k] = avgs[i];
				for (int l = 0; l < amount; l++) {
					if (diffs[l] > Math.abs(fars[k] - avgs[i])) {
						fars[k] = data[l];
						index = l;
					}
				}
				diffs[index] = 0;
			}
			System.out.println("A" + (i + 1) + ": " + avgs[i]);
		}
	}
}