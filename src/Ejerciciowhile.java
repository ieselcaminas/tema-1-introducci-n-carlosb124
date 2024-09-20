import java.util.Scanner;

public class Ejerciciowhile {

    public static class EjercicioWhile {
        public static void main(String[] args) {
            int num;
            int positives = 0;


            Scanner sc = new Scanner(System.in);
            System.out.println("Dime 10 números y te diré cuáles son positivos");


            for (int contador = 0; contador < 10; contador++) {
                num = sc.nextInt();
                if (num >= 0) {
                    positives = positives + 1;

                }
            }

            System.out.println("Tu numero de positivos es " + positives);
        }
    }
}