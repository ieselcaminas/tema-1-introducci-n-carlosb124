import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        int num;
        int num2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        System.out.println("Ingrese su resta");
        num2 = sc.nextInt();


        do {
            num = num - num2;

        } while (num >= num2);

        System.out.println("el resto es " + num);



    }
}
