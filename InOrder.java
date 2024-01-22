/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num = (int)(Math.random()*10);
		int temp = 0;
		while ((num != (temp - 1))) {
			System.out.print(num + " ");
			temp = num;
			num = (int)(Math.random()*10);
		}
	}
}
