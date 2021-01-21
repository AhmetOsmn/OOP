public class SimpleTime {
	private int second; //0-59
	private int minute; //0-59
	private int hour; //0-23

	public SimpleTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

	public String buildString() {
		return String.format("%24s: %s\n%24s: %s",
				"this.toUniversalString()",this.toUniversalString(),
				"toUniversalString()",toUniversalString());
	}

}
