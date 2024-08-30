package javanotes;

import java.util.Scanner;

public class Switch {

    static int productId;
    static String productName;
    static double cost;
    static float profit;
    static double price;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }
    public static void  createProduct(){
        String [] product = new String[5];

        System.out.println("Id");
        productId = sc.nextInt();
        sc.nextLine();
        product[0] = productId + "";
        System.out.println("productName");
        productName = sc.nextLine();
        product[1] = productName;
        System.out.println("cost");
        cost = sc.nextDouble();
        sc.nextLine();
        product[2] = Double.toString(cost);
        System.out.println("Profit");
        profit = sc.nextFloat();
        sc.nextLine();
        product[3] = profit + "";
        System.out.println("precio ");
        price = calculatePrice(profit, cost);
        product[4] = Double.toString(price);
        System.out.println(price);
    }

    public static double calculatePrice(float profit, double cost){

        double price = cost/(1-(profit/100));
        return price;
    }
    public  static void  printProduct(){

        System.out.println("id " + productId + "\n" +
                "nombre producto " + productName + "\n" +
                "precio " + price);
    }

    public static void menu(){

        System.out.println("Selecione 1. Crear producto" + " "+
                "2.ver producto");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Crear producto: ");
                createProduct();;
                break;

            case 2:
                System.out.println("Ver producto: ");
                printProduct();
                break;

            default:
                System.out.println("Ingrese una opcion valida");
        }



    }
}
