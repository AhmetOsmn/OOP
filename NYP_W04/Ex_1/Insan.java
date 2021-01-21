public class Insan {

	private String ad, cins;
	private int yas;
	private double boy, kilo;

	public Insan(String ad, String cins, int yas, double boy, double kilo){
		this.ad = ad;
		this.cins = cins;
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
	}
	public Insan(){}

	public String getAd(){
		return ad;
	}
	public void setAd(String ad){
		this.ad = ad;
	}

	public String getCins(){
		return cins;
	}
	public void setCins(String cins){
		this.cins = cins;
	}

	public int getYas(){
		return yas;
	}
	public void setYas(int yas){
		this.yas = yas;
	}

	public double getBoy(){
		return boy;
	}
	public void setBoy(double boy){
		this.boy = boy;
	}

	public double getKilo(){
		return kilo;
	}
	public void setKilo(double kilo){
		this.kilo = kilo;
	}

}
