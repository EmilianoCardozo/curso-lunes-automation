package Clase_3;

public class P4condicionales {

    public static void main(String[] args) {

        int Var_1 = 100;
        int Var_2 = 200;

        if (Var_1 < Var_2) {
            System.out.println("Var_1 es menor a Var_2");
        }

        int Var_3 = 200;
        int Var_4 = 100;

        if (Var_3 < Var_4) {
            System.out.println("Var_3 es menor a Var_4");
        }
        else {
            System.out.println("Var_3 es mayor a Var_4");
        }

        String DiaDeLaSemana = "Martes";

        switch (DiaDeLaSemana) {
            case "Lunes":
                System.out.println("El dia es Lunes");
                break;
            case "Martes":
                System.out.println("El dia es Martes");
                break;
            case "Miercoles":
                System.out.println("El dia es Miercoles");
                break;
            default:
                System.out.println("El dia no existe!");
        }
    }
}
