package Strings;

public class ReverseaStringWithoutBuiltSort {

	public static void main(String[] args) {
		
		String string="hello";
		String rev="";
		
		for(int i=string.length()-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		System.err.println(rev);
	}
}
