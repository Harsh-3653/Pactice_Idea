package Calculator;

import java.util.Scanner;

public class Calculator_3 {
    static int integer_no_1, integer_no_2;
    static float float_no_1, float_no_2;
    static boolean int1 = false;

    static boolean int2 = false;
    static boolean float1 = false;
    static boolean float2 = false;
    static boolean firstTime1 = true;
    static boolean firstTime2 = true;

    public static void type(Scanner s) {

        if (s.hasNextInt()) {
            if (firstTime1) {

                integer_no_1 = s.nextInt();
                int1 = true;

                firstTime1 = false;
            } else {
                int2 = true;
                integer_no_2 = s.nextInt();
            }

        } else if (s.hasNextFloat()) {
            if (firstTime2) {
                float1 = true;
                float_no_1 = s.nextFloat();
                firstTime2 = false;
            } else {
                float2 = true;
                float_no_2 = s.nextFloat();
            }
        }

    }

    public static void main(String args[]) {
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        System.out.println("Enter first no");

        type(first);
        System.out.println("Enter second no");
        type(second);

        Functions2_New obj1 = new Functions2_New();

        boolean verify = true;


        if (int1 == true) {
            if (int2 == true) {

                obj1.method1(integer_no_1, integer_no_2);
            } else {
                obj1.method1(integer_no_2, float_no_1);

            }

        } else {
            if (float2 == true) {
                //System.out.println(f1+" "+f2);
                obj1.method1(float_no_1, float_no_2);
            } else {

                obj1.method1(float_no_1, integer_no_1);
            }
        }

    }

}
