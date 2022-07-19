package armstrong;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong_No
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int sum =0, digit,num;
        System.out.println("Enter number");
        String a = scan.next();
        int pow=a.length();

        int number=Integer.parseInt(a);


        num = number;

        while (num!=0){
            digit = num%10;
            sum = (int) (sum + Math.pow(digit,pow));
            num /= 10;
        }

        System.out.println(number==sum?"armstrong":"not armstrong");

    }
}
