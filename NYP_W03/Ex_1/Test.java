import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {

		FirstClass nesne1 = new FirstClass();
		nesne1.Display();

		System.out.println("Text giriniz: ");
		String girdi;

		inp = new Scanner(System.in);

		girdi = inp.nextLine();

		FirstClass nesne2 = new FirstClass();
		nesne2.Display2(girdi);
	}

}
