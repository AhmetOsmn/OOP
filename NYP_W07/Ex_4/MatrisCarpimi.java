public class MatrisCarpimi {

	public static void main(String[] args) {
		int num1[][] = {{1,2,3},{3,4,5},{5,6,7}};
		int num2[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		Carp(num1, num2);
	}

	public static void Carp(int a[][], int b[][]){
		int i,j,k;
		int sonuc[][] =new int [a.length][b[0].length];
		for(i=0;i<a.length;i++){
			for(k=0;k<b[0].length;k++){
				for(j=0;j<b.length;j++){
					sonuc[i][k] += a[i][j]*b[j][k];
				}
			}
		}

		for(i=0;i<sonuc.length;i++){
			for(j=0;j<sonuc[i].length;j++){
				System.out.printf("%d ",sonuc[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
