package day6;

public class Methods {
    // No of parameters accepted is 255

    public void welcome() {   // no return, no parameters

        System.out.println("Welcome");
    }

    public int mul(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 30;
        Methods obj = new Methods();
        int result = obj.mul(num1, num2);
        System.out.println("product is:" + result);
    }

}