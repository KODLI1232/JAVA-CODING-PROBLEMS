package TcsNqt;

public class OddOccuringElements {
	
	public static int findOddOccuredElements(int[] arr) {
		
		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("Array not found");
		}
		
		int result=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			result^=arr[i];
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		int[] array= {5,5,2,2,3,1,1};
		
		int oddElement=findOddOccuredElements(array);
		
		System.out.println("The odd occuring elemets :"+oddElement);
		
	}
}
