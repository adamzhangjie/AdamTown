
public class Problem2 {

	/**
	 * @param args 1000000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firNum = 1,secNum = 2;
		int nextNum = 0,evenSum = 2;
		for(;nextNum<4000000;){
			nextNum = firNum + secNum;
			firNum = secNum;
			secNum = nextNum;
			if(nextNum%2 ==0)
				evenSum+=nextNum;
		}
		System.out.println("the reslut is:"+evenSum);

	}

}
