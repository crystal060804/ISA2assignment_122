package Question1_122;

public class addtwonum {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;
        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}