package Lambda_Expression;

interface Mul{
	int multiply(int a,int b);
}

public class Multiplication {
	public static void main(String[] args) {

	Mul mul=(a,b)->a*b;
	int result=mul.multiply(5, 5);
	System.out.println("Multiplication of numbers is :"+result);

}

}