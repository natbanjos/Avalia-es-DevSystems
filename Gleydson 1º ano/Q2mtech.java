import java.util.Scanner;

public class Q2mtech {
    static void main() {
        Scanner temperatura = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em Celsius: ");
        double temp =  temperatura.nextDouble();
        double farem = (temp*9/5) + 32;
        double kelvin = temp + 273.15;

        System.out.println("Temperatura Celsius: "+ temp);
        System.out.println("Fahrenheit: "+ farem);
        System.out.println("Kelvin: "+ kelvin);
    }
}
