package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter un nombre: ");
        number = scan.nextInt();
        do {
            System.out.println("Recommencez: ");
            number = scan.nextInt();
        } while ((number < 1) || (number > 10));
        System.out.println("Le nombre est: " + number);
    }
}
