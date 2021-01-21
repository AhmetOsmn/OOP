import java.util.*;

public class ZarOrnegi {

	public static void main(String[] args) {

		Random numRandom = new Random();

		int rakamlar[] = {0,0,0,0,0,0};
		int sayi;

		for(int i=0; i<10; i++){
			sayi = 1+numRandom.nextInt(6);
			System.out.println(sayi);
			rakamlar[sayi-1] = rakamlar[sayi-1]+1;
		}
		System.out.println("\n");
		for(int i=0;i<rakamlar.length;i++){
			System.out.printf("%d:%d ",i+1,rakamlar[i]);
		}
	}

	public static int zarAt(Random n){
		return 1+n.nextInt(6);
	}

}
