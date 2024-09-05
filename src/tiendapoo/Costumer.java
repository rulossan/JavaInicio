package tiendapoo;

import java.util.Scanner;

public class Costumer extends User {


    //atributos
    String costumerType;
    int experiencePoints;

    //metodos


    @Override
    public void createUser() {
        super.createUser();
        System.out.println("Ingrese un usuario");
        costumerType=sc.nextLine();
        System.out.println();
    }

    @Override
    public void selectUser() {
        super.selectUser();
    }

    @Override
    public void selectUser(int userId) {
        super.selectUser(userId);
    }

    @Override
    public void updateUser() {
        super.updateUser();
    }
}