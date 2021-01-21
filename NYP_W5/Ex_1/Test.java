import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {

		inp = new Scanner(System.in);

		int ort, notlar_toplami=0, notlar;
		for(int i=0;i<10;i++){
			System.out.println("Lütfen not giriniz: ");
			notlar = inp.nextInt();
			notlar_toplami += notlar;
		}
		ort = notlar_toplami/10;
		System.out.println(ort);
	}

}
