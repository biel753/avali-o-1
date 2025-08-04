import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("--- Conversor de Temperatura ---");
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble(); // Lê a temperatura em Celsius

        // --- Conversão para Fahrenheit ---
        double fahrenheit = (celsius * 9 / 5) + 32;

        // --- Conversão para Kelvin ---
        double kelvin = celsius + 273.15;

        // --- Exibição dos Resultados ---
        System.out.println("\n--- Práticas ---");
        System.out.printf("Temperatura em Celsius: %.1f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin); // Kelvin geralmente tem mais precisão

        scanner.close(); // Fecha o objeto Scanner
    }
}
