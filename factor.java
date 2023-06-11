import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class factor {
    int number;
    int factorOFNumber()
    {
        int factorial=1;
        for (int i=1;i<=number;i++)
        {
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("enter the number=");
        Scanner scanner=new Scanner(System.in);
        factor factor=new factor();
        factor.number=scanner.nextInt();
        System.out.println("Factors of given number is"+factor.factorOFNumber());
    }
}
