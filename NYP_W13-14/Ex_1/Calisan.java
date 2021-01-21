public abstract class Calisan {

	private String ad;
	protected static int saatlik_ucret;
	protected int  calisma_saati;

	public Calisan(String a, int ucret, int cs){
		setAd(a);
		saatlik_ucret = ucret;
		calisma_saati = cs;
	}

	public abstract int Hesapla();

	public String toString(){
		return String.format("Saatlik_Ucret = %d, " + "Calisma saati = %d",saatlik_ucret,calisma_saati);
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void SetUcret(int ucret){
		saatlik_ucret = ucret;
	}


}
