import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {

		inp = new Scanner(System.in);

		String ad, cins;
		int yas;
		double kilo, boy;

		System.out.println("Ad: ");
		ad = inp.nextLine();
		System.out.println("Cins: ");
		cins = inp.nextLine();
		System.out.println("Yas: ");
		yas = inp.nextInt();
		System.out.println("Kilo: ");
		kilo = inp.nextDouble();
		System.out.println("Boy: ");
		boy = inp.nextDouble();

		Insan i3 = new Insan(ad,cins,yas,kilo,boy);


		System.out.println(i3.getAd()+" "+ i3.getCins()+" "+i3.getYas()+" "+i3.getKilo()+" "+i3.getBoy());




	}

}
