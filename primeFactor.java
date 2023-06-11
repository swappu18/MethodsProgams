import java.util.Scanner;

public class primeFactor {
    int number;
    int primeFactor(){
        for (int i=2;i<=number;i++)
        {
            while(number%i==0)
            {
                System.out.println(i+"");
                number=number/i;   //number/i;

            }
        }
        if (number>2){
            System.out.println("prime factor are"+number);
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        primeFactor prime = new primeFactor();
        prime.number=scanner.nextInt();
        prime.primeFactor();

    }
}
