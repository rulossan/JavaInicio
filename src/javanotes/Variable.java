package javanotes;

public class Variable {

    public static void main(String[] args) {

        byte moveLeft;  //declarando varibles
        moveLeft = 127;
        short moveLeft2 = (short) moveLeft;

        System.out.println(moveLeft2);

        moveLeft2 = 130;

        // recibe dos valores numericos pero uno de ellos es de tipo string

        int num1= 19;

        String num2 = "23";

        // parceo de variables

        int newNum2 = Integer.parseInt(num2);

        float promedio = (num1 + newNum2)/2;

        System.out.println(promedio);



    }
}
