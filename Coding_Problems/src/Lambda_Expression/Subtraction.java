package Lambda_Expression;

interface Sub{
	int subtraction(int a,int b);
}
public class Subtraction {
	
	public static void main(String[] args) {
		
		Sub sub=(a,b)->a-b;
		
		int result=sub.subtraction(20,10);
		
		System.out.println(result);
	}

}
