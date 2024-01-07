package Clase_3;

public class P5bucles {

    public static void main(String[] args) {

        //While

        int contador = 0;

        while (contador < 5) {
            System.out.println("hola mundo");

            contador = contador +1;
        }

        System.out.println();

        //Do while

        int contadordowhile = 0;
        do {
            System.out.println("hola mundo");
            contadordowhile++;
        } while (contadordowhile <5);

        System.out.println();

        //For

        for (int i = 0; i < 5; i ++) {
            System.out.println("hola mundo");
        }
    }
}
