public class Yuzdeli extends Calisan{

	private int yuzde;
	public Yuzdeli(String a, int ucret, int cs, int y){
		super(a, ucret, cs);
		yuzde = y;
	}
	public int Hesapla(){
		if(calisma_saati > 20){
			return saatlik_ucret+((calisma_saati-20)*yuzde);
		}
		else{
			return saatlik_ucret*calisma_saati;
		}
	}

	public String toString(){
		return String.format("%s Yuzde = %d", super.toString(),yuzde);
	}


}
