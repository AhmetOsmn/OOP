public class IkiBoyutluDiziler {

	public static void main(String[] args) {
		int arr[][] = {{10,20,30},{40,50,60}};

		for(int i=0;i<arr.length;i++){
			int ortalama = 0;
			for(int j=0;j<arr[i].length;j++){
				ortalama += arr[i][j];
			}
			System.out.println("Ortalama = "+(ortalama/arr[i].length));
		}

	}

}
