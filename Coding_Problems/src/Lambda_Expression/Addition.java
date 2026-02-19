package Lambda_Expression;

interface Add{
    
    int addition(int a, int b);
}

public class Addition{
    
    public static void main(String[] args){
        
        // Lambda expression to add two numbers
        Add add = (a, b) -> a + b;
        
        int result = add.addition(10, 20);
        System.out.println("Sum: " + result);
    }
}


