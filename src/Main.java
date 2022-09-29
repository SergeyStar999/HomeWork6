import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);
        System.out.println(a);

        //Задание 1
        int sumMoney = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMoney += arr[i];
        }
        System.out.println("Сумма трат за месяц составила - " + sumMoney + " рублей.");

        //Задание 2
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила - " + min + " рублей.");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила - " + max + " рублей.");

        //Заадние 3
        double days = 30;
        double avverageSum = sumMoney / days;
        System.out.println("Средняя сумма трат за месяц составила " + avverageSum + " рублей");

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}