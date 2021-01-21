public class PolyTest {

	public static void main(String[] args) {
		Sinif1 c1 = new Sinif1();
		Sinif1 c2 = new Sinif2();
		Sinif1 c3 = new Sinif3();
		Sinif2 c4 = new Sinif3();

		c1.mtd();	//-->s1
		c2.mtd();	//-->s2
		c3.mtd();	//-->s3
		c4.mtd();	//-->s3


	}

}
