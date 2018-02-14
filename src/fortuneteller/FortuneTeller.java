/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortuneteller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class FortuneTeller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String retireAge;
        String money;
        String vacationHome;
        String transportation;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Fortune Teller " + name + ".");
        System.out.println("You can exit anytime by entering QUIT.");

        System.out.println("Enter your age.");
        String age = scanner.nextLine();
        if (age.equals("QUIT")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        int remainder = Integer.parseInt(age) % 2;

        //ask for birth month
        System.out.println("Please enter your birth month as a number. For example, January would be 1.");
        String birthMonth = scanner.nextLine();
        if (birthMonth.equals("QUIT")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }

        //ask for number of siblings
        System.out.println("How many siblings do you have?");
        String numberOfSiblings = scanner.nextLine();
        if (numberOfSiblings.equals("QUIT")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }

        //ask for favorite color
        System.out.println("What is your favorite ROYGBIV color? Type help if you don't know what ROYGBIV is.");
        String favColor = scanner.nextLine();
        if (favColor.equals("QUIT")) {
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        String lowercaseColor = favColor.toLowerCase();
        
        
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        if (lowercaseColor.equals("help")) {
            System.out.println("These are the ROYGBIV colors");
            for (String color : colors) {
                System.out.println(color);
            }
            System.out.println("What is your favorite color?");
            lowercaseColor = scanner.nextLine();
            if (lowercaseColor.equals("QUIT")) {
                System.out.println("Nobody likes a quitter...");
                System.exit(0);
            }

        }
        if (remainder == 1) {
            retireAge = "10";
        } else {
            retireAge = "20";
        }
        
        //assigning bank account based on birth month
        if (Integer.parseInt(birthMonth) <= 0) {
            money = "$0.00";
        } else if (Integer.parseInt(birthMonth) >= 1 && Integer.parseInt(birthMonth) <= 4) {
            money = "$25,000";
        } else if (Integer.parseInt(birthMonth) >= 5 && Integer.parseInt(birthMonth) <= 8 ){
            money = "$250,000";
        } 
        else if (Integer.parseInt(birthMonth) >= 9 && Integer.parseInt(birthMonth) <= 12){
            money = "$1 million";
        }
        else{
            money = "$0.00";
              
        }
        
        //retirement home based on siblings
        if (numberOfSiblings.equals("0")){
            vacationHome = "Aspen";
        }
        else if (numberOfSiblings.equals("1")){
            vacationHome = "Naples, FL";
        }
        else if (numberOfSiblings.equals("2")){
            vacationHome = "Paris";
        }
        else if (numberOfSiblings.equals("3")){
            vacationHome = "Montana";
        }
        else{
            vacationHome = "Rehobeth Beach";
        }
        
        //assign transportation based on favorite color
        if(lowercaseColor.equals("red")){
            transportation = "Bentley";
        }
        else if (lowercaseColor.equals("orange")){
            transportation = "yacht";
        }
        else if (lowercaseColor.equals("yellow")){
            transportation = "helicopter";
        }
        else if (lowercaseColor.equals("green")){
            transportation = "Lear jet";
        }
        else if (lowercaseColor.equals("blue")){
            transportation = "dinghy";
        }
        else if (lowercaseColor.equals("indigo")){
            transportation = "truck";
        }
        else{
            transportation = "limousine";
        }
        
        //fortune statement
        System.out.println(name + ", you will retire in " + retireAge + " years with " + money + " in the bank and a vacation home in " + vacationHome + " and a " + transportation + ".");
        
        
        
    }
        
}

