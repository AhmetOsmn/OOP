public class TakimLideri extends Muhendis {

	private int projeSayisi;

	public TakimLideri(String n, String sn, Time bd, int id, int m, int cs, int ps){
		super(n, sn, bd, id, m, cs);
		projeSayisi = ps;
	}

	public void BenKimim(){
		System.out.println("Ben bir Takim Lideriyim, adim= "+name+" dogum gunum = "+bDay.getDay()+" "+bDay.getMonth()+" "+bDay.getYear()+" Maasim= "+maas);
	}

	public int MaasHesapla(){
		return maas*calisma_saati*projeSayisi;
	}

	public void mtd(){
		System.out.println("TK metodu");
	}

}
