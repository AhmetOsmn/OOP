import java.util.*;

public class Test {

	private static Scanner inpScanner;

	public static void main(String[] args) {
		inpScanner = new Scanner(System.in);

		int s1,s2,s3,sonuc;
		int sonuc2;

		System.out.println("3 adet sayi giriniz: ");

		s1=inpScanner.nextInt();
		s2=inpScanner.nextInt();
		s3=inpScanner.nextInt();

		sonuc = Test.enBuyuk(s1,s2,s3);
		sonuc2 = Math.max(s1, (Math.max(s2, s3)));

		System.out.println("En buyuk = "+sonuc);
		System.out.println("En buyuk = "+sonuc2);


	}

	public static int enBuyuk(int s1, int s2,int s3){
		int eb;
		eb = s1;
		if(s2>eb) eb = s2;
		if(s3>eb) eb = s3;
		return eb;
	}

}
