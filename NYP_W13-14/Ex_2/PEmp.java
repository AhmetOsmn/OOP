public class PEmp extends SalEmp {

	private double oran, satis;
	public PEmp(String n, int i, double m, double o, double s){
		super(n, i, m);
		oran = o;
		satis = s;
	}

	public double getSatis(){
		return satis;
	}
	public double getOran(){
		return oran;
	}
	public double Hesapla(){
		return GetMaas() + (getOran()*getSatis());
	}

	public String toString(){
		return String.format("%s", super.toString());
	}
}
