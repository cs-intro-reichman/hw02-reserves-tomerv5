
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		char currentChild;
		char previousChild = '-';
		int numOfchildren = 0;
		while ((currentChild = (Math.random() < 0.5 ? 'g' : 'b')) == previousChild || numOfchildren == 0) { //Assigning new value to currentChild and checking equlity to previousChild.
			System.out.print(currentChild + " ");
			previousChild = currentChild;
			numOfchildren++;
		}
		numOfchildren++;
		System.out.print(currentChild + "\nYou made it... and you now have " + numOfchildren + " children.");
		
	}
}
