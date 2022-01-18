public class MultiDimensionArray{
	
	public static void main(String[] args) {
		int multidimension[][] = {{5, 5, 5},{7, 8, 8},{8, 9, 9}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(multidimension[i][j] + "");
			}
			System.out.println();
		}
	}

}