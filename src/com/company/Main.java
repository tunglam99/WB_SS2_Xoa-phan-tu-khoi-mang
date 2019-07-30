package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        int arr[] = new int [size];
        for (int i=0; i<size;i++){
            System.out.printf("arr["+i+"]: ");
            arr[i] = scanner.nextInt();
        }


        int index =0;
        System.out.println("nhap phan tu muon xoa");
        int number = scanner.nextInt();
        boolean check = false;
        for (int i =0; i<size;i++) {
            if (arr[i] == number) {
                check = true;
                index = i;
            }
        }
        if (check) {
            System.out.println("phan tu " + number + " co trong mang");
            for (int i = index; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size] = 0;
            System.out.println("mang sau khi xoa la: ");
            for (int i = 0; i < size-1; i++) {
                System.out.println("arr[" + i + "]" + arr[i]);
            }
        } else
            System.out.println("khong co phan tu" + number+ "trong mang");
    }
}
