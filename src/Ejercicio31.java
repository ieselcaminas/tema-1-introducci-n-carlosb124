import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        int num;
        boolean divisor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " es divisor de " + num);

            }

        }
    }

}
