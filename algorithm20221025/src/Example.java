import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        /*int a = 10;
        long b = 15;

        double c = 239.56;

        boolean v = true;
        boolean p = false;

        String str = "hsfhsfhsfhsfh dgdg adgagda ";

        int[] arr = new int[] { 0, 1, 2, 3 };
        int[] arr2 = new int[5];*/

        /*arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        arr[1] = 42;

        String[] an = new String[5];
*//*
        System.out.println(arr.length);
        System.out.println(arr2.length);

        if (a < b) {
            System.out.println("A is in fact smaller than B");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 1;
        int y = 10;

        while (x < y) {
            x += 1;
            System.out.println("TRUE");
        }
        */

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        int a = scanner.nextInt();
        System.out.println("2");
        int b = scanner.nextInt();
        System.out.println("3");
        int c = scanner.nextInt();

        int sum = a + b + c;

        System.out.println("сумма " + sum);
     */
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("True");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("False");
        }

    }
}