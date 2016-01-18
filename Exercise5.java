import java.io.* ;

class Smooth {

	public static void main ( String[] args ) {
		int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
		int[] smooth = new int[signal.length];

		for (int j = 0; j < signal.length; j++) {
			int x = signal[j];

			if (j == 0) {
				smooth[j] = (x + signal[j + 1]) / 2;
			} else if (j == signal.length - 1) {
				smooth[j] = (x + signal[j - 1]) / 2;
			} else {
				smooth[j] = (x + signal[j - 1] + signal[j + 1]) / 3;
			}
		}

		for (int j = 0; j < smooth.length; j++) {
			System.out.println(smooth[j]);
		}
	}
}