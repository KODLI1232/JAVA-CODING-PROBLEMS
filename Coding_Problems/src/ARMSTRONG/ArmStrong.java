package ARMSTRONG;

public class ArmStrong {

	public static void main(String[] args) {
		
		int n=153;
		
		int temp=n;
		
		int sum=0;
		
		int digits=0;
		
		// count digits
		
		int t=n;
		while(t>0) {
		  digits++;
		  t/=10;
		}
		
		// calculate Armstrong sum
		
		t=n;
		
		while(t>0) {
			int r=t%10;
			sum+=Math.pow(r, digits);
			t/=10;
		}
		
		if(sum==temp) {
			System.out.println("ArmStrong number");
		}else
		System.out.println("Not an Armstrong number");
	}
}
