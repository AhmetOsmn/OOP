public class Kisi {

	protected String name, sname;
	Time bDay;
	public Kisi(String n, String sn, Time bd){
		name = n; sname = sn; bDay = bd;
	}
	public void BenKimim(){
		System.out.println("Ben bir kisiyim, adim= "+name+" dogum gunum = "+bDay.getDay()+" "+bDay.getMonth()+" "+bDay.getYear());
	}

}
