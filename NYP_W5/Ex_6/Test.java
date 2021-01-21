import java.util.*;

public class Test {

	public static void main(String[] args) {

		Random random = new Random();

		int zar1, zar2;

		zar1 = zarToplam(random);
		zar2 = zarToplam(random);

		if((zar1+zar2)%2==0)
			System.out.println("Zar toplami = "+(zar1+zar2)+" Cift sayi");
		else
			System.out.println("Zar toplami = "+(zar1+zar2)+" Tek sayi");

	}

	public static int zarToplam(Random rand){
		int sayi;
		sayi = 1+rand.nextInt(6);
		return sayi;
	}
}
