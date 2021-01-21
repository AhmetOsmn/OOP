import java.util.*;


public class KartDestesi {
	private int kart_sayisi = 52;
	private Kart [] deste;

	//Kart tipinde nesneleri tutmak icin.

	public KartDestesi(){
		String [] no = {"As","Papaz","Kiz","Vale","2","3","4","5","6","7","8","9","10"};
		String [] tur = {"Kupa","Karo","Sinek","Maca"};
		//tur ve no bilgisini bu dizilerden cekecegiz

		deste = new Kart[kart_sayisi];

		for(int i=0;i<deste.length;i++){
			deste[i] = new Kart(no[i%13], tur[i/13]);
		}
	}
	public Kart [] getDeste(){
		return deste;
	}

	public Kart [] desteKaristir(Kart deste[]){
		Random random = new Random();
		for(int i=0;i<deste.length;i++){
			int x = random.nextInt(kart_sayisi);
			Kart tempKart = deste[i];
			deste[i] = deste[x];
			deste[x] = tempKart;
		}


		return deste;
	}

	public void desteYazdir(Kart deste[]){
		for(int i=0;i<deste.length;i++){
			System.out.print(deste[i].ToString()+" - ");
			if(i%13==12) System.out.print("\n");
		}
	}
	public Kart Dagit(){
		int siradakiKart = 0;

		if(siradakiKart < deste.length)
			return deste[siradakiKart++];
		else {
			return null;
		}
	}

}
