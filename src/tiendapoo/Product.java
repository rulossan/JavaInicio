package tiendapoo;

import java.util.Scanner;

public class Product {

    // Atributos
     int productId;
     String productName;
     double cost;
     float profit;
     double price;

    Scanner sc = new Scanner(System.in);


     //Comportamientos

    public void  createProduct(){
        String [] tags ={"Id", "ProductName", "Cost","Profit", "Price"};
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


        for(int i=0; i< tags.length; i++){             // for en la version larga para un array
            System.out.println(tags[i] +" "+ product[i]);
        }

        for (String item: product){    //foreach
            System.out.println(item);
        }
    }

    public double calculatePrice(float profit, double cost){

        double price = cost/(1-(profit/100));
        return price;
    }
    public  void  printProduct(){

        System.out.println("id " + productId + "\n" +
                "nombre producto " + productName + "\n" +
                "precio " + price);
    }
}
