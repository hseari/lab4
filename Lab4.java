package com.company;

//2. Написать программу, удаляющую из целочисленного массива А размерности N элементы, равные целочисленному Х.
//В результате должен получиться массив не большей размерности. На экран должны выводиться как оригинальное состояние массива, так и итоговое.

import java.util.Scanner;
import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int deleted;
        int[] newarray = null;
        int[] array = new int[2 ^ 32];
        int i;
        int counts = 0;
        System.out.print("Введите целое число: ");   //Вводим элементы массива до "quit"
        for (i = 0; !in.hasNext("quit"); i++) {
            System.out.print("Введите целое число: ");
            array[i] = in.nextInt();
            counts++;
        }
        int[] Temparray = new int[counts];   //Копируем элементы в массив нужной размерности
        for (int n = 0; n < counts; n++) {
            Temparray[n] = array[n];
        }
        in.next();                   //Вводим число, которое должно удалиться
        System.out.print("Введите число, которое должно быть удалено: ");
        deleted = in.nextInt();

        //Вариант 1. Удаление заменой на ноль
        System.out.println("Изначальный массив: " + Arrays.toString(Temparray)); //Выводим старый массив

        for (i = 0; i < Temparray.length; i++) {    //Создаем новый массив, в котором все числа, равные введенному равны нулю
            if (Temparray[i] == deleted) {
                Temparray[i] = 0;
            }
        }

        //Выводим новый массив
        System.out.println("Новый массив: " + Arrays.toString(Temparray));

        //Вариант2. Удаление смещением назад
        //for (i = 0; i < Temparray.length; i++) {    //Копируем элементы в новый массив, смещая на один назад
        //    for (i = 0; Temparray[i] == deleted; i++) {
        //        newarray = new int[Temparray.length - 1];
        //        for (int index = 0; index < Temparray.length - 1; index++) {
        //            newarray[index] = Temparray[index];
        //        }
        //        for (int j = i; j < Temparray.length - 1; j++) {
        //            newarray[j] = Temparray[j + 1];
        //        }
        //    }
        //    break;
        //}
        //Выводим старый и новый массивы
        //System.out.println("Изначальный массив: " + Arrays.toString(Temparray));
        //System.out.println("Новый массив: " + Arrays.toString(newarray));

        in.close();
    }
}