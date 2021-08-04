package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(walk(23, 34));
        System.out.println(walk(12, 45));
        System.out.println(walk(67, -34));
        System.out.println(walk(20, 46));
        System.out.println(walk(45, -26));


        System.out.println(generateRandomAge());
    }

    public static String walk(int age, int temperature) {
        if ((age < 45 || age > 20) || (temperature > -20 || temperature < 30)) {
            return "Можно идти гулять";

        } else if (age < 20 || (temperature > 0 || temperature < 28)) {
            return "Можно идти гулять";

        } else if (age > 45 || (temperature > -10 || temperature < 25)) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";

        }


    }

    public static String generateRandomAge() {
        Random age = new Random();
        int num = age.nextInt();
        return ("Можно идти гулять");
    }
}