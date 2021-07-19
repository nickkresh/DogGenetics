package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        startDogGenetics();
    }

    public static void startDogGenetics() {
        Scanner myObj = new Scanner (System.in);
        System.out.println("What is your dog's name?");
        String dogName = myObj.next();
        generateDNABackgroundReport(dogName);
    }

    public static void generateDNABackgroundReport(String dogName) {
        System.out.println("\nWell then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:\n");
        Random r = new Random();
        ArrayList<Integer> load = new ArrayList<Integer>();
        String[] dogBreeds = {"King Doberman", "Common Cur", "Chihuahua", "St. Bernard", "Dramatic RedNosed Asian Pug"};
        int temp = 0;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            if (!(i == 5)) {
                temp = r.nextInt((100 - sum) / (5 - i)) + 1;
                System.out.println(temp + "% " + dogBreeds[i - 1]);
                load.add(temp);
                sum += temp;
            } else {
                int last = (100 - sum);
                load.add(last);
                sum += last;
                System.out.println(last + "% " + dogBreeds[i - 1]);
            }
        }

        System.out.println("\nWow, that's QUITE the dog!");
    }
}