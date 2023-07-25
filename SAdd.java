import java.util.Scanner;
class SAdd {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter 2nd number");
        int b = s.nextInt();
        System.out.print("sum of "+a+"and "+b+" is "+(a+b));
    }
}