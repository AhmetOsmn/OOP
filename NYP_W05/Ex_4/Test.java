public class Test {

	public static void main(String[] args) {

		int sonuc;
		//int sonuc2;

		Araba a1 = new Araba();

		a1.setAll("opel", 10, 2);

		sonuc = Araba.Hizlan(a1.getHiz(), a1.getIvme()); //static olan Hizlan() metodunun örnek kullanimi.
		//sonuc2 = a1.Hizlan(a1.getHiz(), a1.getIvme());

		System.out.println("Sonuc = "+sonuc);
		//System.out.println("Sonuc = "+sonuc2);


	}

}
