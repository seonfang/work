package cn.com.taiji;

public class Stairs {

	public static void main(String[] args) {
		final int stairsCount = 11;
		
		System.out.println("Stairs.main(上到该层不同的方式有多少种：) "+getNum(stairsCount));
	}
	
		private static int getNum(int i) {
			// TODO Auto-generated method stub
			if(i==1) {
			return	1;
			}
			if(i==2) {
				return 2;			
						}
			return getNum(i-1)+getNum(i-2);
		}
}
