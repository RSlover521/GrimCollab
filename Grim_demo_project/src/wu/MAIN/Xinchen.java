package wu.MAIN;

public class Xinchen {
	public static void main (String[] args) {
		myFunc(197, true);
		}
	public static void myFunc (int number, boolean test) {
		if (number % 2 == 0) {
			test = true;
		} else {
			test = false;
		}
		System.out.println(test);
	}
}
