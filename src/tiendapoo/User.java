package tiendapoo;

import java.util.Scanner;

public class User {

    int userId;
    String userName;
    String lastName;
    String email;
    String password;
    boolean status;

    Scanner sc = new Scanner(System.in);
    //Metodos

    public void createUser(){

        System.out.println("Ingrese el Id");
        userId = sc.nextInt();
        sc.nextLine();

    }

    public void selectUser(){


    }

    public void selectUser(int userId){


    }

    public void updateUser(){

    }

    public void deletUser(int userId){

    }
}
