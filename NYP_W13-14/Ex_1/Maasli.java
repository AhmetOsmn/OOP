public class Maasli extends Calisan{

	public Maasli(String a, int ucret, int calisma_saati){
		super(a, ucret, calisma_saati);
	}

	public int Hesapla(){
		return saatlik_ucret*calisma_saati;
	}

}
