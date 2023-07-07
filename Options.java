package tasks;

import java.util.Scanner;

public class Options {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select an operation:");
        System.out.println("case 1: +");
        System.out.println("case 2: -");
        System.out.println("case 3: *");
        System.out.println("case 4: Sqrt");
        System.out.println("case 5: %");
        int x=scanner.nextInt();

        switch (x){
            case 1:
            {
                System.out.println("Insert #1 ");
                int f =scanner.nextInt();
                System.out.println("Insert #2 ");
                int s =scanner.nextInt();
                int res =f+s;
                System.out.println("res = " + res);
                break;
            }
            case 2:
            {
                System.out.println("Insert #1 ");
                int f =scanner.nextInt();
                System.out.println("Insert #2 ");
                int s =scanner.nextInt();
                int res =f-s;
                System.out.println("res = " + res);
                break;
            }
            case 3:
            {
                System.out.println("Insert #1 ");
                int f =scanner.nextInt();
                System.out.println("Insert #2 ");
                int s =scanner.nextInt();
                int res =f*s;
                System.out.println("res = " + res);
                break;

            }
            case 4:
            {
                System.out.println("Insert #1");
                double f =scanner.nextDouble();

                double res =Math.sqrt(f);
                System.out.println("res = " + res);
                break;
            }
            case 5:
            {
                System.out.println("Insert #1 ");
                int f =scanner.nextInt();
                System.out.println("Insert #2 ");
                int s =scanner.nextInt();
                if (s!=0){
                    int res =f%s;
                }
                else {
                    System.out.println("please change  #2 ");
                }

                break;

            }
            default:
                System.out.println("check options");

        }
        scanner.close();
    }
}
