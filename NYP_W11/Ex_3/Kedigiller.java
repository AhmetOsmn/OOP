public class Kedigiller {

	protected int kilo;
	protected float boy;
	public Kedigiller(float b, int k){
		boy = b;
		kilo = k;
	}

	public float VKI(){
		return (boy*boy)/kilo;
	}
}
