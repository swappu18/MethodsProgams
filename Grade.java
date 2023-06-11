import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter yours marks");
        int marks= scanner.nextInt();
        System.out.println(getGrade(marks));
    }
    private static String getGrade(int marks)
    {
        String grade="FAIL";
        if(marks>=91&&marks<=100)
        {
            grade="A";
        }
        if (marks>=71&& marks<=90)
        {
            grade="B";

        }
        if (marks>=51 && marks<=70)
        {
            grade="C";

        }
        if (marks>=35 && marks<=50)
        {
            grade="D";
        }
        if (marks<=35)
        {
            grade="fail";
        }
        return grade;
    }
}
