import java.util.*;

public class Test {

	public static void main(String[] args) {

		Calisan [] calisanlar = new Calisan[3];

		for(int i=0;i<3;i++){
			calisanlar[i] = CalisanSec();
		}

		for(int j=0;j<3;j++){
			BenKimim(calisanlar[j]);
		}
	}//end main

	public static Calisan CalisanSec(){
		Random rndRandom = new Random();
		int sec;
		sec = rndRandom.nextInt()%3;

		Calisan c1 = null;

		if(sec == 0){
			c1 = new Calisan();

		}
		if(sec == 1){
			c1 = new Muhendis();

		}
		if(sec == 2){
			c1 = new Patron();

		}
		return c1;
	}//end CalisanSec()

	public static void BenKimim(Calisan a){
		a.mtd();
	}
}
