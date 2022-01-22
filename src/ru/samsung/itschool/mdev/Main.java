package ru.samsung.itschool.mdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" "); // "1" "0" "-4" "4" "0"
        int[] x = new int[strs.length]; // 0 0 0 0 0
        for(int i=0;i< strs.length;i++) {
            x[i] = Integer.parseInt(strs[i]);
        }
        // "test".equals("sdfsdf")
        // Сравнение строк в Java - метод equals()
                int counter=0;
        for(int i=0;i<x.length;i++) {
            if(x[i] == 0) {
                counter = counter + 1;
            } else {
                System.out.print(x[i] + " ");
            }
        }
        for(int i=0;i<counter;i++) {
            System.out.print("0 ");
        }
    }
}
