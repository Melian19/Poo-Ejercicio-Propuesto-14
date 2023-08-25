import java.util.Scanner;

public class PooEj14{
    public static void main(String[] args){
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        double numero = entrada.nextDouble(); 
        double cuadrado = Math.pow(numero,2); //Numero**2
        double cubo = Math.pow(numero,3); //Numero**3
        System.out.println("El cuadrado de "+numero+" es "+cuadrado);
        System.out.println("El cubo de "+numero+" es "+cubo);
    }
}