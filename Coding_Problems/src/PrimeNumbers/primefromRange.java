package PrimeNumbers;

public class primefromRange {

	public static void main(String[] args) {
		int a=1;
		int b=100;
		for(int i=a;i<b;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean checkPrime(int num) {
		
		if(num<2) {
		return false;
		}else {
			int x=num/2;
			for(int i=2;i<x;i++) {
				if( num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
