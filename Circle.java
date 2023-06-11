import java.util.Scanner;

public class Circle {
    float r;//r=radius
    float area()
    {
        float areaOfCircle=(float)(3.142*r*r);
        return areaOfCircle;
    }
    float circumference()
    {
        float circumferenceOfCircle=(float)(2*3.142*r);
        return circumferenceOfCircle;
    }

    public static void main(String[] args) {
        System.out.println("enter the radius of circle");
        Scanner scanner=new Scanner(System.in);
        Circle circle=new Circle();
        circle.r= scanner.nextFloat();
        System.out.println("Area of circle"+circle.area());
        System.out.println("circumference of circle"+circle.circumference());
    }

}
