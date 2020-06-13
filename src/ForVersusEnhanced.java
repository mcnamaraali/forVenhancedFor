
public class ForVersusEnhanced {

	public static void main(String[] args) {
		int total = 0;
		String[] inputs = {"red", "yellow", "purple"};
		String[] input2 = {"red", "yellow", "purple","red", "yellow", "purple"};
	//	String[] otherInputs = new String[5];
		
		for (int count = 1; count <= 10; count++) {
			total = total + count;
			System.out.printf("This is within the for loop %d%n", total);
		}
		
		for (String input: input2) {
			System.out.printf("%n%ninput is %s%n", input);
		}

	}

}
