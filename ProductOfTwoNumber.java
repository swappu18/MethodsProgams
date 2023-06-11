import java.util.Scanner;

public class ProductOfTwoNumber {
    int num1;
    int num2;
    int product()
    {
        int productOfTwoNumber=num1*num2;
        return productOfTwoNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner scanner=new Scanner(System.in);
        ProductOfTwoNumber multiply =new ProductOfTwoNumber();
        multiply.num1=scanner.nextInt();
        multiply.num2=scanner.nextInt();
        System.out.println("Addition of two number"+multiply.product());

    }
}


