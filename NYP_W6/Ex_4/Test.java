public class Test {
	public static void main(String[] args){

		KartDestesi d1 = new KartDestesi();
		d1.desteYazdir(d1.getDeste());
		System.out.println("-------------------------------------------------------");
		d1.desteYazdir(d1.desteKaristir(d1.getDeste()));


	}
}
