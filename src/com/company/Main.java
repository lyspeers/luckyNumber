package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int i = 2;
        while (i == 2) {
            Scanner in = new Scanner(System.in);
            System.out.println("What is your name");
            String n = in.next();

            randomNum newNum = new randomNum(n);
            newNum.perfectRandom();
            System.out.print("hello " + n + " your lucky number is " + newNum.rn);

            in = new Scanner(System.in);
            System.out.println("Would you like to exit(0), See you number again(1) or enter a new name(2)");
            i = in.nextInt();
        }
    }
}
