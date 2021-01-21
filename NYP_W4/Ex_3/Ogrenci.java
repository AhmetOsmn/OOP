public class Ogrenci {

	private String ad;
	private int not1, not2;

	public Ogrenci(){}
	public Ogrenci(String ad, int not1, int not2){
		this.setAd(ad);
		this.setNot1(not1);
		this.setNot2(not2);
	}


	public int Ortalama(int n1, int n2){
		return (n1+n2)/2;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getNot1() {
		return not1;
	}
	public void setNot1(int not1) {
		this.not1 = not1;
	}

	public int getNot2() {
		return not2;
	}
	public void setNot2(int not2) {
		this.not2 = not2;
	}

}
