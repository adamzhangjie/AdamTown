
public class Problem3_prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long largestPrime = 2 ,calNum = 2;
		long destNum = 600851475143L ;
		while(calNum<=destNum){
			System.out.println("----"+calNum);
			if(destNum%calNum == 0){
				destNum = destNum /calNum;
				largestPrime = calNum;
			}
				
			else
				calNum++;
		}
		System.out.println("the result is :"+largestPrime);

	}

}
