package ru.synergyitacademy;

import java.util.Scanner;

public class ArraySize {
    private static int indexBox;
    private static int[] box = new int[1];

    private static void addInBox(int elem) {
        if (indexBox < box.length)

        box[indexBox++] = elem;

        else{
            box = getNewArr(box);
            box[indexBox++] = elem;
        }
    }

    private static int[] getNewArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length * 2];
        for (int i = 0; i < oldArr.length; i++)
            newArr[i] = oldArr[i];
        return newArr;
    }

    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        boolean run = true;

        do {
            System.out.print("Введите число: ");
            addInBox(Integer.parseInt(in.nextLine()));
            System.out.print("Продолжить? (y/n): ");
            if (in.nextLine().equalsIgnoreCase("n")) {
                run = false;
            }
        } while (run);

        for (int i = 0; i < box.length; i++) {
            System.out.printf("Индекс числа %d само число %d \n", i, box[i]);
        }
        System.out.print("Выход из программы.");
        in.close();
    }
}

