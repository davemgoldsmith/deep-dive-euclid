package edu.cnm.deepdive.euclid;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = gcd(a, b);
			
			System.out.printf("a =%d, b = %d, GCD = %d %n", a, b, result);
			
		}

		catch (NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println("This application requires two integer values");
		}

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("This application must have at least two integer values");
		}
	}

	public static int gcd(int a, int b) {
		
		return 0;

	}

}
