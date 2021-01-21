public class CalisanTest {

	public static void main(String[] args) {

		Calisan c1 = new Calisan("Ahmet", "Sezgin", 123, 20, 20);
		YuzdeliCalisan c2 = new YuzdeliCalisan("Osman", "Sezgin", 125, 30, 30, 0.5);
		Patron p1 = new Patron("XYZ", "KLM", 100, 40, 50, 0.5);

		//System.out.println(c1.GetAd()+" "+c1.GetSoyad()+" "+c1.GetID()+" "+" Alacagi ucret= "+c1.Kazanc());
		//System.out.println(c2.GetAd()+" "+c2.GetSoyad()+" "+c2.GetID()+" "+" Alacagi ucret= "+c2.Kazanc());

		c1.mtd(); //20
		c2.mtd(); //30 30
		p1.mtd(); //40 40

	}

}
