import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num;
        int mult;
        int total = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        System.out.println("Ingrese su multiplicación");
        mult = sc.nextInt();


        for (int i = 1; i <= mult; i++) {
            total = total + num;


        }

        System.out.println(total);
    }
}
