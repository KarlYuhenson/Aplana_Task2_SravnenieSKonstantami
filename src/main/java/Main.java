import jdk.tools.jaotc.collect.SourceProvider;

import java.util.Scanner;

public class Main {
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int number = Integer.parseInt(value);


        switch (number){
            case (X):
            case (Y):
            case (Z):
                System.out.println("Данное значение имеется в константах");
                break;

            default:
                System.out.println("Такой константы нет!");

        }
}
    }