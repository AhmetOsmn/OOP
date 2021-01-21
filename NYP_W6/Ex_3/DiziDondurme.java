public class DiziDondurme {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int i=0;
		a = mtd(a);
		for(i=0;i<a.length;i++){
			System.out.printf("%d,",a[i]);
		}
	}

	public static int [] mtd(int x[]) {
		int i;
		for(i=0;i<x.length;i++){
			x[i] = x[i]*2;
		}
		return x;
	}

}
