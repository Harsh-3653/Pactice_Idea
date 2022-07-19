package Calculator;

import java.util.Scanner;

public class Functions2_New {

    public void method1(int a, int b) {
        while (true) {
            System.out.println("Enter 1 for addition  \n" + "Enter 2 for substraction \n"
                    + "Enter 3 for multiplication \n" + "Enter 4 for division \n" + "Enter 5 for exit");

            Scanner scan = new Scanner(System.in);
            int no = scan.nextInt();

            switch (no) {
                case 1:
                    int c = a + b;
                    System.out.println("sum is " + c);
                    break;

                case 2:
                    int d = a - b;
                    System.out.println("substraction = " + d);
                    break;

                case 3:
                    int e = a * b;
                    System.out.println("multiplication = " + e);
                    break;

                case 4:
                    int f = a / b;
                    System.out.println("division = " + f);

                    break;
                default:
                    System.exit(0);

            }
        }
    }

    public void method1(int a, float b) {

        while (true) {
            System.out.println("Enter 1 for addition  \n" + "Enter 2 for substraction \n"
                    + "Enter 3 for multiplication \n" + "Enter 4 for division \n" + "Enter 5 for exit");

            Scanner scan = new Scanner(System.in);
            int no = scan.nextInt();

            switch (no) {
                case 1:
                    float c = a + b;
                    System.out.println("sum = " + c);
                    break;

                case 2:
                    float d = a - b;
                    System.out.println("sub = " + d);
                    break;

                case 3:
                    float e = a * b;
                    System.out.println("multiplication = " + e);
                    break;

                case 4:
                    float f = a / b;
                    System.out.println("division = " + f);

                    break;
                default:
                    System.exit(0);

            }
        }

    }

    public void method1(float a, int b) {

        while (true) {
            System.out.println("Enter 1 for addition  \n" + "Enter 2 for substraction \n"
                    + "Enter 3 for multiplication \n" + "Enter 4 for division \n" + "Enter 5 for exit");

            Scanner scan = new Scanner(System.in);
            int no = scan.nextInt();

            switch (no) {
                case 1:
                    float c = a + b;
                    System.out.println("sum = " + c);
                    break;

                case 2:
                    float d = a - b;
                    System.out.println("sub = " + d);
                    break;

                case 3:
                    float e = a * b;
                    System.out.println("multiplication = " + e);
                    break;

                case 4:
                    float f = a / b;
                    System.out.println("division = " + f);

                    break;
                default:
                    System.exit(0);

            }
        }
    }

    public void method1(float a, float b) {

        while (true) {
            System.out.println("Enter 1 for addition  \n" + "Enter 2 for substraction \n"
                    + "Enter 3 for multiplication \n" + "Enter 4 for division \n" + "Enter 5 for exit");

            Scanner scan = new Scanner(System.in);
            int no = scan.nextInt();

            switch (no) {
                case 1:
                    float c = a + b;
                    System.out.println("sum = " + c);
                    break;

                case 2:
                    float d = a - b;
                    System.out.println("sub = " + d);
                    break;

                case 3:
                    float e = a * b;
                    System.out.println("multiplication = " + e);
                    break;

                case 4:
                    float f = a / b;
                    System.out.println("division = " + f);

                    break;
                default:
                    System.exit(0);

            }

        }

    }
}
