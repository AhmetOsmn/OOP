public class Patron extends Calisan {

	protected int maas;

	public Patron (String a,int ucret, int cs, int maas){
		super(a, ucret, cs);
		this.maas = maas;
	}

	public int Hesapla(){
		return maas+(calisma_saati*saatlik_ucret);
	}

	public String toString(){
		return String.format("%s Yuzde = %d", super.toString(), maas);
	}

}
