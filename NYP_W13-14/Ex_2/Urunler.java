public class Urunler implements Inter {

	private String urun;
	private double fiyat, mik;
	public Urunler(String u, double f, double m){
		urun = u;
		fiyat = f;
		mik = m;
	}
	public double Hesapla(){
		return fiyat*mik;
	}

	public String toString(){
		return String.format("Urun = %s, Mik = %f, Fiyat = %f, Odeme = %f", urun, mik, fiyat, Hesapla());
	}

}
