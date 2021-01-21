public class ABSTest {
	public static void main(String[] args){

		Maasli c1 = new Maasli("Ali", 20, 20);
		Yuzdeli c2 = new Yuzdeli("Ahmet", 20, 30, 2);
		Patron c3 = new Patron("PTR", 30, 20, 100);

		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c1.getClass().getName(), c1.toString(), c1.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c2.getClass().getName(), c2.toString(), c2.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c3.getClass().getName(), c3.toString(), c3.Hesapla());

		c1.SetUcret(30);
		System.out.println("------------------------");

		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c1.getClass().getName(), c1.toString(), c1.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c2.getClass().getName(), c2.toString(), c2.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c3.getClass().getName(), c3.toString(), c3.Hesapla());

		c1.SetUcret(45);
		System.out.println("------------------------");

		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c1.getClass().getName(), c1.toString(), c1.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c2.getClass().getName(), c2.toString(), c2.Hesapla());
		System.out.printf("Ben bir %s 'im, %s Toplam ucret = %d\n", c3.getClass().getName(), c3.toString(), c3.Hesapla());

	}
}
