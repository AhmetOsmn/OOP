public class YuzdeliCalisan extends Calisan {

	private double yuzde;

	public YuzdeliCalisan(String a, String s, int ID, double ucret, double saat, double yuzde){
		super(a, s, ID, ucret, saat);
		this.yuzde = yuzde;
	}

	@Override
	public double Kazanc(){
		double fazla;
		if(saat>20){
			fazla=super.saat-20;
			return (fazla*yuzde*ucret)+(20*ucret);
		}
		else {
			return super.Kazanc();
		}
	}
	public void mtd(){
		System.out.println("Yuzdeli calisan sinifi saatlik ucreti="+ucret+" Superclass'in saatlik ucreti= "+super.GetUcret());
	}

}
