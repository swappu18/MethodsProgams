import java.util.Scanner;

public class EvenOdd {
    int number1;
    boolean num(){
        boolean evenNumber;
        if (number1%2==0)
        {
            evenNumber=true;
        }
        else
        {
            evenNumber=false;

        }
        return evenNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        EvenOdd evenOdd=new EvenOdd();
        evenOdd.number1=scanner.nextInt();
        System.out.println("given number is "+evenOdd);


    }
}
