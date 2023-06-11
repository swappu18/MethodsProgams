import java.util.Scanner;

public class perfectNumberForSingle {
    static int number;
    static int perfectNumber(){
        int sum=0;
        for (int i=1;i<=number/2;i++)
        {
            if (number%i==0)
            {
                sum=sum+1;  //sum+=1
            }
        }
        System.out.println((sum==number)?"the number is perfect number":"the number is not perfect number");
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        perfectNumberForSingle.number= scanner.nextInt();
        perfectNumberForSingle.perfectNumber();
    }
}
