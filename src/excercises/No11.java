package excercises;

import java.util.Scanner;

public class No11 {
	public static void main(String[] args){		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = console.nextInt();

		System.out.println("2 * " + a + " = " + (a*2));
		
		//closes console to prevent memory overuse
		console.close();
}
}
/**
 * 11b. If the parentheses are removed, then the console prints the number concatenated to itself
 * 	e.g. 1 would output 11 2 would output 22 12 would output 1212
 */
