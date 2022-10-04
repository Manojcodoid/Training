package Java;

import java.util.Scanner;

class primenumber {
    static int a = 2, b, me = 0;

    public static void main (String[] args) {
        Scanner b = new Scanner(System.in);
        int c = b.nextInt();

        while (a < c) {
            if (c % a == 0) {
                me++;
                break;
            }
            a++;
        }
        if (me == 0) {
            System.out.println("its is a prime number");

        } else {
            System.out.println("not a prime number");
        }
    }
}
