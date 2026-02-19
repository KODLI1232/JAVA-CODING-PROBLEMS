package Lambda_Expression;

interface division{
	int division(int a,int b);
}
public class Divison {
	
	public static void main(String[] args) {
		
		division divide = (a,b)->a/b;
		
		int result=divide.division(10, 2);
		
		System.out.println(result);
		
		
		
	}

}
