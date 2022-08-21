import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color;
        double lado;

        Scanner x=new Scanner(System.in);
        System.out.println("ingrese el color");
        color=x.next();
        System.out.println("ingrese el lado");
        lado =x.nextDouble();
        cuadrado c1= new cuadrado (color,lado);
        System.out.println("el area del cuadrado 1 es : "+ c1.calcularArea());
        System.out.println("el color del cuadrado es " + c1.getColor());


        cuadrado c2= new cuadrado("verde" ,2.3 );
        System.out.println("el area del cuadrado 1 es : "+ c2.calcularArea());
        System.out.println("el color del cuadrado es " + c2.getColor());

        triangulo tr = new triangulo("verde",3,4);
        System.out.println("el area del triangulo es :" + tr.calcularArea());
        System.out.println("el color del triangulo es : "+ tr.getColor());
    }
}
