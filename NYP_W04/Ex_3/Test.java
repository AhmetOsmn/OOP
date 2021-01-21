import java.util.*;

public class Test {

	private static Scanner inp;

	public static void main(String[] args) {
		Ogrenci o1 = new Ogrenci("Ahmet",80,95);
		Ogrenci o2 = new Ogrenci();
		inp = new Scanner(System.in);


		String isim;
		int n1,n2;

		System.out.println("İsim: ");
		isim = inp.nextLine();
		System.out.println("Not 1: ");
		n1 = inp.nextInt();
		System.out.println("Not 2: ");
		n2 = inp.nextInt();

		o2.setAd(isim);
		o2.setNot1(n1);
		o2.setNot2(n2);

		System.out.println(o1.getAd()+" "+o1.Ortalama(o1.getNot1(),o1.getNot2()));
		System.out.println(o2.getAd()+" "+o2.Ortalama(o2.getNot1(),o2.getNot2()));



	}

}
