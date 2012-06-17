
public class Problem4_Pali {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long largest_p = 100;
/*		StringBuffer testString = new StringBuffer("1234567");
		StringBuffer revTest = testString.reverse();
		System.out.println(revTest);*/
		for(long i = 100;i<1000;i++){
			for(long j = 100;j<1000;j++){
				long t = i*j;
				StringBuffer tempValue = new StringBuffer(String.valueOf(t));
				String tempValueS = tempValue.toString();
				String revertValueS = tempValue.reverse().toString();
				
				if(tempValueS.equals(revertValueS)  && largest_p<t){
					largest_p = t;
					System.out.println(t+"----"+i+"------"+j+"--------"+tempValueS+"--------"+revertValueS);
				}
			}
		}
		System.out.println("this is the result:"+largest_p);

	}
	private static int pic(int k)
	{
		
		return 1;
	}

}
