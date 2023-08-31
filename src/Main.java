import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(Even_Odd(num));
    }
    static String Even_Odd(int number)
    {
        if (number%2==0)
        {
            return "Even Number";
        }
        else
        {
            return "Odd Number";
        }
    }
}