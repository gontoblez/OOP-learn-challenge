package com.example.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eye leftEye = new Eye("Left Eye", "Short sighted", "Red", true);
        Eye rightEye = new Eye("Right Eye", "Normal", "Red", true);
        Heart heart = new Heart("Heart", "Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD", true);
        Skin skin = new Skin("Skin", "Burnt", "Black");

        Patient patient = new Patient("Alex", 34, leftEye, rightEye, heart, stomach, skin);

        Scanner scanner = new Scanner(System.in);

        Organ[] organ = {
                leftEye,
                rightEye,
                heart,
                stomach,
                skin
        };

        boolean loop = true;

        int no = 1;

        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());
        System.out.println("Select organ:");

        while (loop) {
            for (int i = 0; i < organ.length; i++) {
                System.out.println("\t"+no+". " + organ[i].getName());
                no++;
            }
            int condition = scanner.nextInt() - 1;
            organ[condition].baseInfo();

            switch (condition + 1) {
                case 1:
                    if (patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close Eye");
                    }
                    int close = scanner.nextInt();
                    if (close == 1) {
                        System.out.println("Eye Closed.");
                    }
                    break;
                case 2:
                    if (patient.getRightEye().isOpen()) {
                        System.out.println("\t\t1. Close Eye");
                    }
                    close = scanner.nextInt();
                    if (close == 1) {
                        System.out.println("Eye Closed.");
                    }
                    break;
                case 3:
                    System.out.println("\t\t1. Change heart rate.");
                    int changeRate = scanner.nextInt();
                    if (changeRate == 1) {
                        System.out.println("Enter the new heart rate:");
                    }
                    int newRate = scanner.nextInt();
                    patient.getHeart().setRate(newRate);
                    System.out.println("The new heart rate is: " + patient.getHeart().getRate());
                    break;
                case 4:
                    if (patient.getStomach().isEmpty()) {
                        System.out.println("Need to be fed");
                        System.out.println("\t\t1. Digest");
                    }
                    int digest = scanner.nextInt();
                    if (digest == 1) {
                        System.out.println("Digestion began...");
                    }
                case 5:
                    break;
            }
            System.out.println("Continue?");
            System.out.println("\t\t1. Yes");
            System.out.println("\t\t2. No");
            int play = scanner.nextInt();
            if (play == 2) {
                loop = false;
            }
            no = 1;
        }

    }
}
