/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 2;
		int sum = 1;
		String st = num + " is a perfect number since " + num + " = 1";
		while (i<num) {
			if (num % i == 0) {
				sum = sum + i;
				st = st + " + " + i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println(st);
		}
		else {
			System.out.println(num + " is not a perfect number");
		}

	}
}
