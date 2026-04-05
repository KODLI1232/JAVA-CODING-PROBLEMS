package Arrays;

public class MissingAndDuplicate {
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4};
		
		int n=arr.length;
		
		int sum=0,squareSum=0;
		
		for(int num : arr) {
			sum +=num;
			squareSum += num * num;
		}
		
		int expectedSum = n * (n+1)/2;
		int expectedSquareSum = n * (n+1) * (2 * n + 1)/6;
		
		int diff=expectedSum-sum;
		int squareDiff = expectedSquareSum - squareSum;
		
		int sumXY = squareDiff / diff;
		
		int missing =(diff + sumXY)/2;
		int duplicate = sumXY - missing;
		
		System.out.println("Missing number: "+missing);
		System.out.println(("Duplicate: "+duplicate));
	}

}
