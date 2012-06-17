import java.util.*;
public class Problem7_prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		long iniNum = 2;
		list.add(2);
		for(int i = 3;list.get(list.size()-1)<2000000;i++)
		{
			for(int j =0;j<list.size();j++){
				if(i%list.get(j) == 0)
					break;
				else if(i%list.get(j) !=0 && j == list.size()-1)
				{
					list.add(i);
					//System.out.println("the "+list.size() +"Num is "+i);
				}
			}
		}
		long sumS = 0;
		for(int i =0; i<list.size()-1;i++){
			 sumS+=list.get(i);
		}
		System.out.println(sumS);

	}

}
