import java.lang.Math;
import java.util.Scanner;

public class QuadDriver {
	public static void main(String[] args) {
	
		Quadratic formula = new Quadratic();
		Scanner getNumber = new Scanner(System.in);
		
		//We start by asking the user for the first coefficient, a.
		System.out.println("What is the first coefficient? ");
		formula.firstCoefficient = getNumber.nextInt();
		
		//Now we're going to ask for the second coefficient, b.
		System.out.println("What is the second coefficient? ");
		formula.secondCoefficient = getNumber.nextInt();
		
		//Finally, we're going to ask the user for the third coefficient, c.
		System.out.println("What is the third coefficient? ");
		formula.thirdCoefficient = getNumber.nextInt();
		
		//Now, we're going to evaluate those numbers and plug them into the formula. 
		int firstStep = -formula.secondCoefficient;
		double secondStep = -formula.secondCoefficient + Math.sqrt((formula.secondCoefficient * formula.secondCoefficient) - 4 * (formula.firstCoefficient * formula.thirdCoefficient));
		double secondStepTwo = -formula.secondCoefficient - Math.sqrt((formula.secondCoefficient * formula.secondCoefficient) - 4 * (formula.firstCoefficient * formula.thirdCoefficient));  
		double thirdStep = secondStep / (2 * formula.firstCoefficient);
		double thirdStepTwo = secondStepTwo / (2 * formula.firstCoefficient);
		
		//Now, we tell the user the results.
		System.out.println("Your two answers are: " + thirdStep + " and " + thirdStepTwo);
	}
}