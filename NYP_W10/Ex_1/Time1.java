public class Time1 {
	private int saniye; //0-59
	private int dakika; //0-59
	private int saat; //0-23

	public void setTime(int h, int m, int s){
		if((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)){
			saat = h;
			dakika = m;
			saniye = s;
		}
		else{
			throw new IllegalArgumentException("saat, dakika veya saniyede hatali giris yapildi.."); //throw: hata mesaji firlatir.
		}
	}

	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", saat, dakika, saniye);
	}

	public String toString() {
		return String.format("%d:%02d:%02d", ((saat == 0 || saat == 12) ? 12: saat % 12),dakika, saniye, (saat < 12 ? "AM" :"PM"));
	}

}
