package com.company;


import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
       /* Пользователь вводит с клавиатуры целое число. Компьютер понимает только "0" и "1".
                Если пользователь вводит "0", программа печатает "zero", если "1", то "one", в противном случае
        "I don't know".*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0)
            System.out.println("zero");
        else if(n==1)
            System.out.println("one");
        else System.out.println("I don't know");

                /*В диапазоне [1..10] найти количество чисел, которые делятся на 2 или на 3.*/
        int x=1;
        int c=0;
        while (x<=10){
            if (x%2==0 || x%3==0){
                c++;
            }
            x++;
        }
        System.out.println(c);
    }
}
