public class Calculator {


    public static void main(String[] args) {

        System.out.println("Welcome to Calculator APP: ");
       int a = 10;
       int b = 20;
       int c = add(a,b);
       System.out.println("Addition of " + a + " and " + b + " is: " + c);

       int d = sub(a,b);
        System.out.println("Subtraction of " + a + " and " + b + " is: " + d);

        int e = mul(a,b);
        System.out.println("Multiplication of " + a + " and " + b + " is: " + e);

        int f = div(a,b);
        System.out.println("Division of " + b + " and " + a + " is: " + f);
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return b-a;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return b/a;
    }
}
