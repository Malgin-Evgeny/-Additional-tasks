import java.util.Scanner;

public class Task3 {
//Составить алгоритм: на входе есть числовой массив,
// необходимо вывести элементы массива кратные 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int element : array) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
        scanner.close();

    }
}

