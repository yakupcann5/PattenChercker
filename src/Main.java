import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int satir, sutun, boyut;

       /*   * * * * * * * * * *
             * * * * * * * * * *
            * * * * * * * * * *
             * * * * * * * * * *
            * * * * * * * * * *
             * * * * * * * * * *
            * * * * * * * * * *
             * * * * * * * * * *
            * * * * * * * * * *
             * * * * * * * * * *  */



        Scanner input = new Scanner(System.in);
        System.out.print("Boyutunu Giriniz : ");
        boyut = input.nextInt();

        for (satir = 1; satir <= boyut; satir++) {
            if (satir % 2==0)
                System.out.print(" ");
            for (sutun = 1; sutun <= boyut; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
