public class Muhendis extends Kisi{

	private int id;
	protected int maas, calisma_saati;

	public Muhendis(String n, String sn, Time bd, int id, int m, int cs){
		super(n, sn, bd);
		this.id=id;
		maas=m; calisma_saati=cs;
	}
	public int getID(){
		return id;
	}

	public void BenKimim(){
		System.out.println("Ben bir Muhendisim, adim= "+name+" dogum gunum = "+bDay.getDay()+" "+bDay.getMonth()+" "+bDay.getYear()+" Maasim= "+maas);
	}

	public int MaasHesapla(){
		return maas*calisma_saati;
	}
}
