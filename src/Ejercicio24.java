import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int nota;
        int sumatorio =0;
        int cuantasnotas =0;
        boolean hayundiez = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        sc.nextInt();

        do {
            nota = sc.nextInt();

            if (nota >= -1) {
                sumatorio += nota;
                cuantasnotas++;


            }
            if (10 == nota) {
                hayundiez = true;
                System.out.println("Hay un diez en las notas");
            }


        }while (nota != -1);

        System.out.println("La nota media es " + sumatorio/cuantasnotas);


    }
}
