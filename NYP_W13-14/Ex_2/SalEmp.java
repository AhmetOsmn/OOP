public class SalEmp extends Emp{

	private double maas;
	public SalEmp(String n, int i, double m){
		super(n, i);
		maas = m;
	}
	public double GetMaas(){
		return maas;
	}
	public double Hesapla(){
		return maas;
	}
	public String toString(){
		return String.format("%s %s %.2f", super.toString(), "Kazanc = ", Hesapla());
	}

}
