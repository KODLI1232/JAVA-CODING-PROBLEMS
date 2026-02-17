package ARMSTRONG;

public class For3Digit {
	
	public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int r=n%10;
			
			sum+=r*r*r;
			n/=10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
