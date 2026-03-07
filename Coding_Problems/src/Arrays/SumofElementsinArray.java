package Arrays;

public class SumofElementsinArray {

	public static void main(String[] args) {
		
		int[] list= {1,2,3,4};
		
		int sum=0;
		
		for(int i=0;i<list.length;i++) {
			
			sum=sum+list[i];
		}

		System.out.println("sum of elements :" +sum);
	}

}
