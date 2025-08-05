package wu.MAIN;

public class Xinchen {
	public static void main (String[] args) {
		myFunc(197, true); // only take in a number
		myFunc(521);
		}
	
	public static void myFunc (int number, boolean test) { // well I meant it to return a boolean variable- Also only takes one integer variable
		if (number % 2 == 0) { // nice logic here
			test = true;
		} else {
			test = false;
		}
		System.out.println(test);
	}
	
	
	// here is the improved answer (yours is still correct, it still works, but it works differently than mine.
	public static boolean myFunc (int num) {
		boolean result = false;
		// if num is divisible by 2, result = true
		if(num % 2 == 0) {
			result = true;
		} 
		// since result is false at default (if num is not divisible at 2, the result will not change)
		return result;
		// P.S. your code still works, but this is just an improvement of it (less lines lmao)
	}
}
