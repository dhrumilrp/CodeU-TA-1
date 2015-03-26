class Sparse{

	static String validSearch(int[][] mtx){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < mtx.length; i++){
			for(int j = 0; j < mtx[0].length; j++){
				if(mtx[i][j] != 0){
					String value = "[" + i + ", " + j + "]: " + mtx[i][j];
					sb.append(value + "\n");
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int[][] matrix1 = new int[][]{
				  { 0, 0, 0, 1 },
				  { 0, 3, 0, 0 },
				  { 0, 0, 5, 0 },
				  { 0, 7, 0, 8 },
				  { 0, 2, 0, 0 }
				};
		
		int[][] matrix2 = new int[][]{
				  { 0, 0, 0 },
				  { 6, 6, 6 },
				  { 0, 0, 5 },
				  { 9, 9, 0 },
				  { 0, 2, 4 }
				};
		
		System.out.println(validSearch(matrix1));
		System.out.println(validSearch(matrix2));
		
	}
}