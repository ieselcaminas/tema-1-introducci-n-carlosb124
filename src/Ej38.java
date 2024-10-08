import java.util.Random;
import java.util.Scanner;


public class Ej38 {
    public static void main(String[] args) {

        int num1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Dime que número es");


        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(100);

        do {
            num1 = sc.nextInt();
            if (secreto > num1) {
                System.out.println("El número secreto es más grande");
                System.out.println("Dime otro numero");
            }else if (secreto < num1) {
                System.out.println("El número secreto es más pequeño");
                System.out.println("Dime otro numero");
            }else if (secreto == num1) {
                        System.out.println("Has acertado");

            }
        } while (secreto != num1 && num1 != -1);
    }
}
