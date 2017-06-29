/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HotelManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] Items = {"MOMO", "Fried Rice", "Chowmein"};
        int Price[] = {120, 150, 100};
        int Quantity[] = {20, 10, 15};

        System.out.println("Choose 1, 2 and/or 3");
        System.out.println("1 for MOMO "
                + " 2 for Fried Rice "
                + " 3 for Chowmein");

        System.out.println("What is your order Sir/Miss?");
        int ch = input.nextInt();
        if (ch == 1) {
            System.out.println("MOMO");

        } else if (ch == 2) {
            System.out.println("Fried Rice");
        } else if (ch == 3) {
            System.out.println("Chowmein");

        } else {
            System.out.println("This item is not here");

            System.exit(0);

        }

        int Qty = 0;
        System.out.println("What quantity of " + Items[ch - 1] + " do you want?");
        Qty = input.nextInt();
        //System.out.println(Quantity[ch - 1] = Quantity[ch - 1] - Qty);

        if (Qty <= Quantity[ch - 1]) {
            System.out.println("Thanks for your order sir");
            System.out.println(
                    "Do you want any other items with it[y/n]?");
            String Item = input.next();

            if (Item.equalsIgnoreCase(
                    "n")) {
                System.exit(0);
            } else {
                System.out.println("We have Pepsi, Dew and Sprite");

                String Drink = input.next();
                System.out.println("After Sometime...... "
                        + "Here is your " + Drink + " Sir");
                System.exit(0);
            }
        } else {
            System.out.println("Sorry Sir, we do not have that much quantity.");
            System.out.println("Would you like to: 1. Make another order   "
                    + "2. Reduce your quantity");
            System.out.println("Our Quantity is : "
                    + " 1. 20 plates"
                    + " 2. 10 plates"
                    + " 3. 15 plates");
        }
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Which order do you want?");
            System.out.println("Choose 1, 2 and/or 3");
            int Ch = input.nextInt();
            switch (Ch) {
                case 1:
                    System.out.println("MOMO");
                    break;
                case 2:
                    System.out.println("Fried Rice");
                    break;
                case 3:
                    System.out.println("Chowmein");
                    break;
                default:
                    System.out.println("This item is not here");
                    
                    System.exit(0);
            }

        } else if (choice == 2) {
            System.out.println("What quantity do you want now?");
            int qty = input.nextInt();
            //System.out.println(Quantity[ch - 1] = Quantity[ch - 1] - qty);
        }

        System.out.println(
                "Do you want any other items with it[y/n]?");
        String Item = input.next();

        if (Item.equalsIgnoreCase(
                "n")) {
            System.exit(0);
        } else {
            System.out.println("We have Pepsi, Dew and Sprite");
        }
        String Drink = input.next();
        System.out.println("After Sometimes...... "
                + "Here is your " + Drink + " Sir");
        System.exit(0);

    }
}
