import java.util.Scanner;

public class FibonacciSeries {
    int number;
    static int fibo(int num)
    {
        int first=0,second =1,temp;
        if (num==0)
            return first;
        if (num==0)
            return second;
        for (int i=2;i<=num;i++)
        {
            temp=first+second;
            first=second;
            second=temp;

        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        FibonacciSeries series=new FibonacciSeries();
        series.number= scanner.nextInt();
        System.out.println("Fibonacci series is"+FibonacciSeries.fibo(series.number));
    }
}
