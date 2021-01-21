import java.util.*;

public class Kaplan extends Kedigiller {

	public Kaplan(float b, int k) {
		super(b, k);

	}

	Scanner scanner = new Scanner(System.in);

	public float VKI(){

		System.out.println("Super VKI() = 1, Normal VKI() = 2");
		int Secim = scanner.nextInt();
		float sonuc = 0;

		if(Secim == 1){
			sonuc = super.VKI();
		}
		if(Secim == 2){
			sonuc = (boy/100)/kilo;
		}

		return sonuc;
	}

}
