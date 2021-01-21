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

		Insan i4 = new Insan(ad,cins);
		i4.setYas(yas);
		i4.setBoy(boy);
		i4.setKilo(kilo);

		System.out.println(i4.getAd()+" "+ i4.getCins()+" "+i4.getYas()+" "+i4.getKilo()+" "+i4.getBoy());




	}

}
