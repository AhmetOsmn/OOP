import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {

		Insan i1 = new Insan();
		Insan i2 = new Insan("Ahmet","Erkek",20, 120, 185);

		inp = new Scanner(System.in);

		String cins;
		int yas;
		double kilo, boy;


		System.out.println("Cins: ");
		cins = inp.nextLine();
		System.out.println("Yas: ");
		yas = inp.nextInt();
		System.out.println("Kilo: ");
		kilo = inp.nextDouble();
		System.out.println("Boy: ");
		boy = inp.nextDouble();

		i1.setAd("Ali");
		i1.setCins(cins);
		i1.setYas(yas);
		i1.setKilo(kilo);
		i1.setBoy(boy);


		System.out.println(i1.getAd()+ " " + i1.getCins()+" "+i1.getYas()+" "+i1.getKilo()+" "+i1.getBoy());
		System.out.println(i2.getAd()+ " " + i2.getCins()+" "+i2.getYas()+" "+i2.getKilo()+" "+i2.getBoy());



	}

}
