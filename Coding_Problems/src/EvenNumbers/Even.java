package EvenNumbers;

import java.util.stream.IntStream;

public class Even {
	
	public static void main(String[] args) {
		
		int n=24;
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Not even");
		}
		
		System.out.println("Using For loop");
		
		for(int i=2;i<100;i+=2) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		System.out.println("Using if stmt");
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("Using streams");
		IntStream.range(1, 100)
					.filter(i->i%2==0)
					.forEach(i->System.out.print(i+" "));
			
	}

}
