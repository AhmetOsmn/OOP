import java.util.ArrayList;

public class DiziListeler {

	public static void main(String[] args) {

		ArrayList<String> itemStrings = new ArrayList<String>();

		itemStrings.add(0,"Sari");	//belirtilen indise eklenir
		itemStrings.add("Kirmizi");
		itemStrings.add("beyaz"); //sona ekleme yapar.
		itemStrings.add(0,"Lacivert");

		System.out.println(itemStrings);

		itemStrings.remove("Sari");
		System.out.println(itemStrings);

		itemStrings.remove(0);
		System.out.println(itemStrings);

	}

}
