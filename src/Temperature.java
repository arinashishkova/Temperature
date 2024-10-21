import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод температуры в градусах Цельсия
        System.out.println("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        // Конвертация температуры в градусы Фаренгейта
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Вывод результата
        System.out.printf("Температура в градусах Фаренгейта: %.2f%n", fahrenheit);
    }
}