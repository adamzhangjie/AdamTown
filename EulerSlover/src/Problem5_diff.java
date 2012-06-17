
public class Problem5_diff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sSum = 0;
		for(int i = 0;i<101;i++){
			sSum+=i*i;
		}
		long dSum = 0;
		for(int j = 0;j<101;j++){
			dSum+=j;
		}
		
		long rSum = dSum*dSum - sSum;
		System.out.println(rSum);

	}

}
