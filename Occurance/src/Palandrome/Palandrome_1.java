package Palandrome;
import java.util.Scanner;
public class Palandrome_1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        StringBuilder stringBuilder=new StringBuilder(str);

        String rev=stringBuilder.reverse().toString();
        System.out.println(rev.equals(str)?"palandrome":"Not palandrome");
    }
}
