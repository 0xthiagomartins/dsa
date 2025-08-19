package src.arrays;

import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();

        int soma = 0, max = arr[0];

        for (int i = 0; i < n; i++) {
            soma += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Maior elemento: " + max);
        sc.close();
    }
}
