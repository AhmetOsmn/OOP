public class Over {
	//private int a;
	//private int b;

	public Over(){

	}
	public Over(int a){
		//this.a=a;
	}
	public Over(int a, int b){
		//this.a = a;
		//this.b = b;
	}

	public void mtd1(){
		System.out.println("mtd1 void");
	}
	public int mtd1(int a){
		System.out.println("mtd1 int");
		return 0;
	}
	public int mtd1(String a){
		System.out.println("mtd1 int");
		return 0;
	}
	public String mtd1(int a, String b){
		return b;
	}
	public String mtd1(int a, int b){
		return "ad";
	}



}
