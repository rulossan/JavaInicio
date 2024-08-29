package javanotes;

import java.util.Scanner;

public class VoidFunction {
    static Scanner sc = new Scanner(System.in);
    static int costumerId;
    static String costumerName;
    static String email;
    static String password;
    static String status;

    public static void main(String[] args) {  //main funcion global de java, static: funcion de clase
        createCostumer();
        printCostumerData();
    }

    public static void createCostumer() {     //creando funcion;  //la colocamos static para que nos funcione la funcion main

        System.out.print("Ingrese el id: ");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del cliente: ");
        costumerName = sc.nextLine();
        System.out.print("email: ");
        email = sc.nextLine();
        System.out.print("password: ");
        password = sc.nextLine();
        System.out.print("Seleccione un estado 1 ó 2 : ");
        int selection = sc.nextInt();
        status = selectStatus(selection);
    }

    public static void printCostumerData() {
        System.out.println("Id" +" " + costumerId + "\n" +
                "Nombre" + " "+costumerName + "\n"
                + "correo" +" "+ email + "\n" +
                "status" +" "+ status);
    }

    public static String selectStatus(int selection) {               //funcion q recibe parametros
        String active = " ";
        if (selection == 1) {
            active = String.valueOf(StatusCostumer.TRUE);

        } else if (selection == 2) {
            active = String.valueOf(StatusCostumer.FALSE);
        }else
        System.out.println("Selección no valida");
        return active;
    }
}