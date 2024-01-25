/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */

 /* compute the average number of children that couples who follow
this strategy end up having.
In addition, compute how many couples had 2 children, 3
children, and 4 or more children. Finally, compute the most common number (also
known in statistics as mode) of children in a family (if there is a tie, print only the first
most common number of children). */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		char currentChild;
		char previousChild = '-';
		int numOfchildren = 0;
		double sumOfchildren = 0.0;
		int twoChildren = 0, threeChildren = 0, fourChildren = 0;

		for (int i = 0;i < T; i++){
			while ((currentChild = (Math.random() < 0.5 ? 'g' : 'b')) == previousChild || numOfchildren == 0) { //Assigning new value to currentChild and checking equlity to previousChild.
				//System.out.print(currentChild + " ");  system check
				previousChild = currentChild;
				numOfchildren++;
			}
			//System.out.println(currentChild + "\n");   system check
			numOfchildren++;
			sumOfchildren = sumOfchildren + numOfchildren;
			if (numOfchildren == 2) twoChildren++;
			if (numOfchildren == 3) threeChildren++;
			if (numOfchildren >= 4) fourChildren++;
			numOfchildren = 0;
			

		}
		System.out.println("Average: " + sumOfchildren / T +" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourChildren);
		String mostCommon = "The most common number of children is ";
		int max = Math.max(Math.max(twoChildren, threeChildren), fourChildren);
		if (max == twoChildren) mostCommon += "2.";
		if (max == threeChildren) mostCommon += "3.";
		if (max == fourChildren) mostCommon += "4 or more.";
		System.out.println(mostCommon);
		//System.out.println(sumOfchildren); system check
	}
}
