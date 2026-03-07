package Arrays;

public class LargestinArray {

	public static void main(String[] args) {

		int[] arr= {1,25,36,48,44};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Maximum number in Array :"+max);

	}

}
