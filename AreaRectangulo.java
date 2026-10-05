import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL ÁREA DE UN RECTÁNGULO ---");
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("El área del rectángulo es: %.2f\n", area);

        scanner.close();
    }
}