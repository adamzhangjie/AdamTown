
public class Problem_Pythagorean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		for(int i=1;i<1000;i++){
			for(int j=i+1;j<1000;j++){
				for(int k=j+1;k<1000;k++){
					if(i*i+j*j == k*k && i+j+k == 1000)
					{
						a=i;
						b=j;
						c=k;
					}
				}
			}
		}
		System.out.println("a:"+a+" b "+b+" c "+c+" sum "+a*b*c);

	}

}
