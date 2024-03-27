package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;
        int max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thu nhat !");
        num1 = sc.nextInt();
        System.out.println("Nhap so thu hai !");
        num2 = sc.nextInt();
        max = getMax(num1, num2);
        System.out.println("So lon nhat la: " + max);
    }
    public static int getMax(int a, int b){
        int res;
        if (a > b){
            res = a;
        }
        else {
            res = b;
        }
        return res;
    }
}