package wu.MAIN;

public class Xinchen {
	public static void main (String[] args) {
		myFunc(197, true);
		
		myFunc(521); // improved method call
		}
	
	public static void myFunc (int number, boolean test) { // well I meant it to return a boolean variable- Also only takes in one integer variable as your parameter
		if (number % 2 == 0) { // nice logic here
			test = true;
		} else {
			test = false;
		}
		System.out.println(test);
		
		// your logic looks good, but what i asked for is returning a boolean. 
	}
	
	
	// here is the improved answer (yours is still correct, it still works, but it works differently than mine)
	public static boolean myFunc(int num) {
		boolean result = false;
		// if num is divisible by 2, result = true
		if(num % 2 == 0) {
			result = true;
		} 
		// since result is false at default (if num is not divisible at 2, the result will not change)
		return result;
	}
}
