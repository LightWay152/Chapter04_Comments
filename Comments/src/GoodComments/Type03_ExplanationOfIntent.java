package GoodComments;

public class Type03_ExplanationOfIntent {

	public static void main(String[] args) {
		demoCatchException();
	}

	private static void demoCatchException() {
		
        int firstValueOfDivision = 10 / 2;
        System.out.println("Result of correct math expression = " + firstValueOfDivision);
 
        //Check result of incorrect math expression
        try {
        	int secondValueOfDivision = 10 / 0;
        	System.out.println("Result of correct math expression = " + secondValueOfDivision);
 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Ignore...");
        }

	}
}
