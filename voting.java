import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        System.out.println("Is eligible for voting"+isEligible(age));
    }
    private static boolean isEligible(int age)
    {
        return age>=18;
    }

}
