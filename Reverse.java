/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String st = args[0];
		int index = st.length()-1;
		while (index >= 0) {
			System.out.print(st.charAt(index));
			index--;
		}
		System.out.println("\nThe middle character is " + st.charAt((st.length()-1)/2));
	}
}
