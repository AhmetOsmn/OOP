import java.util.Scanner;
public class Ornek {

	private static Scanner inpt;

	public static void main(String[] args) {

		inpt = new Scanner(System.in);
		int s1;
		int s2;
		int t;

		System.out.print("Enter first integer: ");
		s1 = inpt.nextInt();

		System.out.print("Enter second integer: ");
		s2 = inpt.nextInt();

		t = s1 + s2;

		System.out.println(t);

	}
}
