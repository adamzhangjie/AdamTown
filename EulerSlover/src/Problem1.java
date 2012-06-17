import java.util.*;
public class Problem1 {

	/**
	 * @param args
	 */
	private static long getResult(long desc){
		long sum = 0,i=0;
		for(i=1; i*3<desc;i++ )
		{
			sum = sum+i*3;
			if(i*5<desc && i%3 != 0)
				sum = sum+i*5;
		}
		return sum;
	}
	public static void main(String[] args) {
		Date first = new Date();
		long firstTime = first.getTime();
		long  sum = 0, dec=100000000,i=1;
		while( i<dec ){
			if(i%3 == 0 || i%5 ==0)
				sum = sum+i;
			i++;
		}
		Date second = new Date();
		long secondTime = second.getTime();
		long wastTime1 = secondTime - firstTime;
		System.out.println("you can see the result is :"+sum);
		System.out.println("old methord wast time is :"+wastTime1);
		sum = getResult(dec);
		System.out.println("you can see the result is :"+sum);
		Date third = new Date();
		long thirdTime = third.getTime();
		long wateTime2 = thirdTime - secondTime;
		System.out.println("wast time is :"+wateTime2);
	}

}
