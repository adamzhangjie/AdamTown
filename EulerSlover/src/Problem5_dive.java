import java.util.*;
public class Problem5_dive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long initNum = 1;
		long largestNum = 0;
		ArrayList<Integer> list = new ArrayList();
		for(int i=2;i<21;i++){
			if(initNum%i != 0){
				int s = i;
				for(int j=0;j<list.size();j++){
					if(s%list.get(j) == 0)
						s = s/list.get(j);
				}
				if(s != 1){
					list.add(s);
					initNum = initNum*s;
				}
				System.out.println(i+"internal num is:"+initNum);
			}
		}
		
		System.out.println(initNum);

	}

}
