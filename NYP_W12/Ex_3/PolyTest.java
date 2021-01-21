public class PolyTest {

	public static void main(String[] args) {

		Time t1 = new Time(21, 3, 2000);

		//Kisi i1 = new Kisi("Ahmet", "Sezgin", t1);

		//Kisi i2;
		Muhendis i3,i4;
		TakimLideri i5;

		//i2 = new Muhendis("A", "B", t1, 123, 300, 20);
		i3 = new Muhendis("ABC", "CBA", t1, 124, 300, 20);
		i4 = new TakimLideri("Lider", "XXX", t1, 125, 300, 20, 3);
		i5 = new TakimLideri("XYZ", "KLM", t1, 126, 300, 20, 6);

		/*
		i1.BenKimim();	//Ben bir kisiyim, adim= Ahmet dogum gunum = 21 3 2000
		i2.BenKimim();
		i3.BenKimim();
		i4.BenKimim();
		i5.BenKimim();
		*/

		//System.out.println("Ucret = "+i2.MaasHesapla()); //ilk tanimlanan sinifinda yani Kisi sinifinda MaasHesapla() metodu bulunmadigi icin hata verir.
		System.out.println("Ucret = "+i3.MaasHesapla());
		System.out.println("Ucret = "+i4.MaasHesapla());	//Bu satirlarda hata vermemesinin sebebi MaasHesapla() metodu hem Muhendis hem de TakimLideri sinifinda bulunmasidir.
		System.out.println("Ucret = "+i5.MaasHesapla());

		//i4.mtd(); //ilk tanimlanan sinifinda yani Muhendis sinifinda mtd() metodu bulunmadigi icin hata verir.
		i5.mtd();

	}
}
