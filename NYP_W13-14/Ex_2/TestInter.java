public class TestInter {

	public static void main(String[] args) {

		// tum odeme alanlari tek vir dizide tutmak istiyorum.
		Inter dizi [] = new Inter[4];
		dizi[0] = new Urunler("u1", 10, 100);
		dizi[1] = new Urunler("u2", 5, 10);
		dizi[2] = new SalEmp("Ali", 1234, 2500);
		dizi[3] = new PEmp("Veli", 200, 2500, 1.5, 10);

		for(int i=0;i < dizi.length;i++){
			System.out.printf("\n%s",dizi[i].toString());
		}
	}
}
