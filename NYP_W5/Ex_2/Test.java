import java.util.*;

public class Test {

	private static Scanner inpScanner;

	public static void main(String[] args) {

		inpScanner = new Scanner(System.in);

		int not,notlar_toplami=0,count=0;
		while(true){
			System.out.println("Durmak icin '-1' tuslayiniz..");
			not = inpScanner.nextInt();
			if(not == -1) break;
			notlar_toplami += not;
			count += 1;
		}
		int ort = notlar_toplami/count;
		System.out.println("Ort: "+ort);

	}
}
