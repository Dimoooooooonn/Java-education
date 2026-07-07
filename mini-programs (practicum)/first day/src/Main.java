import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu(in);
    }


    public static void menu(Scanner in) {
        byte num = -1;
        while (num != 0) {
            System.out.print("0 - остановка программы\n" +
                    "1 - калькулятор\n" +
                    "2 - программа проверки числа на чётность\n" +
                    "3 - вывести таблицу умножения\n" +
                    "4 - найти максимальное число из трёх\n" +
                    "Выбирете что-то из предложенного: ");
            num = in.nextByte();
            switch (num) {
                case 1:
                    calculator(in);
                    break;
                case 2:
                    check(in);
                    break;
                case 3:
                    multiplicationTable(in);
                    break;
                case 4:
                    maxNum(in);
                    break;
                default:
                    System.out.println("Введён неверный символ!");
            }
            System.out.println("-".repeat(50));
        }
    }


    public static void calculator(Scanner in) {
        System.out.print("Введите первое число: ");
        float var1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float var2 = in.nextFloat();

        System.out.print("+, -, *, /\n" +
                "Введите операцию: ");
        String operation = in.next();
        switch (operation) {
            case "+":
                System.out.println("Результат операции(+): "+ (var1 + var2));
                break;
            case "-":
                System.out.println("Результат операции(-): "+ (var1 - var2));
                break;
            case "*":
                System.out.println("Результат операции(*): "+ (var1 * var2));
                break;
            case "/":
                System.out.println("Результат операции(/): "+ (var1 / var2));
                break;
            default:
                System.out.println("Введён неверный символ!");
        }
    }


    public static void check(Scanner in) {
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число " + num + " чётное");
        } else {
            System.out.println("Число " + num + " не чётное");
        }
    }


    public static void multiplicationTable(Scanner in) { //спросить про правильность названий для методов
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        System.out.println();
        }
    }


    public static void maxNum(Scanner in) {
        System.out.print("Введите первое число: ");
        float var1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float var2 = in.nextFloat();
        System.out.print("Введите третье число: ");
        float var3 = in.nextFloat();
        if (var1 >= var2 && var1 >= var3) {
            System.out.println("Максимум из введёных чисел: " + var1); // спросить про фигурные кавычки для однострочных if
        } else if (var2 >= var1 && var2 >= var3) {
            System.out.println("Максимум из введёных чисел: " + var2);
        } else {
            System.out.println("Максимум из введёных чисел: " + var3);
        }
    }
}