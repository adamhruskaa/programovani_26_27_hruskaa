package Úvod_7_9;

import java.util.Scanner;

public class Prumer {
    public static void main(String[] args) {
        String [] arr = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte cislo: ");
        int cislo = scanner.nextInt();
    }

    public String MojePole(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Ahoj";
        }
        return arr;

    }
}