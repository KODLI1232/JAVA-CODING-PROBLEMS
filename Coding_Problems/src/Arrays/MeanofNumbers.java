package Arrays;

public class MeanofNumbers {

	public static void main(String[] args) {
		int[] arr= {1,5,3,6,8,4};
		
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}

		double average=sum/arr.length;
		
		System.out.println(average);
	}

}
