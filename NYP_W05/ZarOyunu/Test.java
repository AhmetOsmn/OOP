import java.util.*;

public class zarOyun {

	private enum Durum{Devam, Kazan, Kaybet};
	public static void main(String[] args) {

		Random num = new Random();

		int puan = 0;

		Durum oyunDurumu;

		int zarToplami = zarAt(num);

		System.out.println("Toplam ="+zarToplami);

		switch (zarToplami){
		case 7:
		case 11: oyunDurumu = Durum.Kazan;
				 break;
		case 2:
		case 3:
		case 12: oyunDurumu = Durum.Kaybet;
				 break;
		default:
			oyunDurumu = Durum.Devam;
			puan = zarToplami;
			System.out.println("Puan = "+puan);
		}

		while(oyunDurumu == Durum.Devam){
			zarToplami = zarAt(num);
			System.out.println("Toplam = "+zarToplami);
			if(zarToplami == puan) oyunDurumu = Durum.Kazan;
			else
				if(zarToplami == 7) oyunDurumu = Durum.Kaybet;
		}
		if(oyunDurumu==Durum.Kazan) System.out.println("KAZANDINIZ");
		else System.out.println("KAYBETTINIZ");


	}

	public static int zarAt(Random n){
		return (1+n.nextInt(6))+(1+n.nextInt(6));
	}

}
