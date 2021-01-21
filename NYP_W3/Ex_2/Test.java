import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {

		inp = new Scanner(System.in);

		int a,b;

		System.out.println("ilk sayiyi girin: ");
		a = inp.nextInt();

		System.out.println("ikinci sayiyi girin: ");
		b = inp.nextInt();

		MetotClass nesne1 = new MetotClass();
		int sonuc = nesne1.TOPLA(a,b);


		System.out.println("|||||||||||||||||||||||||");
		System.out.println(nesne1.TOPLA(a,b));
		System.out.println("-------------------------");
		System.out.println(sonuc);
	}

}
