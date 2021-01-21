public class Class {

	public static void f1(){
		System.out.println("AA");
	}

	public void f2(){
		System.out.println("BB");
	}

	public void f3(){
		//Class.f2();	//f2 static degil, static gibi cagiramayiz.
		f2();			//ayni sinifta oldugu icin cagrilabilir.
		f1();			//ayni sinifta oldugu icin cagrilabilir.
		Class.f1();	//f1 static oldugu icin cagrilabilir.
	}

	public static void f4(){
		//Class.f2();	//f2 static olmadigi icin bu sekilde cagrilamaz.
		//f2();			//f4 static metd, static mtd icinden static olmayan mtd cagrilamaz.
						//static mtdlar sadece static mtdlara erisebilir.

		f1();			//f1&f4 static, ayni siniftalar cagrilabilir.
		Class.f1();	//f1 ve f4 static, ayni siniftalar, f1 static sekilde cagrilabilir.
	}

}
