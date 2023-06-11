import java.util.Scanner;

public class SumOfTwoNumber {
    int num1;
    int num2;
    int sum()
    {
        int sumOfTwoNumber=num1+num2;
        return sumOfTwoNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner scanner=new Scanner(System.in);
        SumOfTwoNumber add=new SumOfTwoNumber();
        add.num1=scanner.nextInt();
        add.num2=scanner.nextInt();
        System.out.println("Addition of two number"+add.sum());

    }
}
