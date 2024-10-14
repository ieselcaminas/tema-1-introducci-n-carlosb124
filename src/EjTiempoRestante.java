
import java.util.Scanner;

public class EjTiempoRestante {
    public static void main(String[] args) {

        int hora;
        int min;
        int seg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que hora es");
        hora = sc.nextInt();

        System.out.println("que min es");
        min = sc.nextInt();

        System.out.println("Cuántos segundos son");
        seg = sc.nextInt();

        while (seg != 60){
            seg = seg + 1;}

            if (seg == 60) {
                min = min + 1;
                seg = 0;
            }
            if (min == 60) {
                hora = hora + 1;
                min = 0;
            }
            System.out.println(hora + ":" + min + ":" + seg);
        }
    }

