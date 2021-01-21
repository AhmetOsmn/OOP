public class Calisan {

	private String ad, soyad;
	private int id;
	protected double ucret, saat;

	public Calisan(String a, String s, int ID, double ucret, double saat){
		ad = a; soyad = s;
		id = ID;
		this.ucret = ucret; this.saat = saat;
	}

	public String GetAd(){return ad;}
	public String GetSoyad(){return soyad;}
	public int GetID(){return id;}
	public double GetUcret(){return ucret;}
	public double GetSaat(){return saat;}

	public double Kazanc(){
		return saat*ucret;
	}
	public void mtd(){
		System.out.println("Calisan sinifi saatlik ucreti =" + ucret);
	}
}
