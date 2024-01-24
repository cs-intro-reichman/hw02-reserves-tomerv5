
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double randomGender = Math.random();
		char gender;
		char previousChild = '0';
		int numOfchildren = 0;
		while ((gender = (randomGender < 0.5 ? 'g' : 'b')) == previousChild || numOfchildren == 0) { //Assigning new value to gender and checking equlity to previousChild.
			System.out.print(gender + " ");
			previousChild = gender;
			numOfchildren++;
			randomGender = Math.random();
		}
		numOfchildren++;
		System.out.print(gender + "\nYou made it... and you now have " + numOfchildren + " children.");
		
	}
}
