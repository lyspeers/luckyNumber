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
            System.out.println("hello " + n + " your lucky number is " + newNum.rn);
            while (i >= 1){

                in = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("Would you like to exit(0), See you number again(1), or enter a new name(2)");
                i = in.nextInt();

                if(i == 2){
                    break;

                }else if(i == 1){
                    System.out.println(n + " your lucky number is " + newNum.rn);

                }else if(i == 0){
                    break;

                }else{
                    System.out.println("PLease input a valid input");

                }
            }
        }
        System.out.print("Thank you for using the lucky number generator");
    }
}
