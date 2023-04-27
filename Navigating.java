/*
    Kathrine Bedard
    CPSC 1060
    RPG Project
    April 27th, 2023
*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//this class is the one that the user navigates through
public class Navigating{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        HashMap<String, Route> map = new HashMap<String, Route>(); 
        ArrayList<String> locations = new ArrayList<String>();
        ArrayList<String> locationTrail = new ArrayList<String>();
        String nextMove = "";
        Route route = new Route(nextMove);

        //print welcome message
        System.out.println("Welcome to the DMV.");
        System.out.println("What is your name?");
        String name = scnr.nextLine();

        System.out.println("Welcome to your driving test" + name);
        System.out.println("The goal is to navigate to various locations around the starting location, the DMV, safely. Pay attention to all signs.");

        //ask user about seatbelt
        System.out.println("You have now entered the car.");
        System.out.println("Would you like to buckle your seatbelt?");
        String seatbelt = scnr.nextLine();

        //check for valid answer
        while (!(seatbelt.equalsIgnoreCase("yes") || seatbelt.equalsIgnoreCase("no"))){
            System.out.println("Invalid input. Please answer yes or no.");
            seatbelt = scnr.nextLine();
        }

        if (seatbelt.equalsIgnoreCase("yes")){
            System.out.println("Good job! Safety is important.");
        } else if (seatbelt.equalsIgnoreCase("no")) {
            System.out.println("Uh oh! Be extra careful. Nearly all states require occupants by law to have their seatbelt on.");
        } 

        //ask user about mirrors
        System.out.println("Would you like to adjust your mirrors? Please answer yes or no");
        String mirrors = scnr.nextLine();

        //check for valid answer
        while (!(mirrors.equalsIgnoreCase("yes") || mirrors.equalsIgnoreCase("no"))){
            System.out.println("Invalid input. Please answer yes or no.");
            seatbelt = scnr.nextLine();
        }

        if (mirrors.equalsIgnoreCase("yes")){
            System.out.println("Good job! It is important to adjust your mirrors to properly see your blindspot.");
        } else if (mirrors.equalsIgnoreCase("no")) {
            System.out.println("Adjusting your mirrors prevents the driver from having dangerous blind spots.");
        } 

        
        System.out.println("You are now leaving the DMV. To end your driving test, please type stop. Visit at least 3 locations to pass your test.");
        System.out.println("Good luck and drive safe!");
        System.out.println("Your options for next location are:");
        System.out.println("Food place");
        System.out.println("School");

        System.out.println("Please choose a location.");
        nextMove = scnr.nextLine();
        
        //count to see if user has visited enough locations
        int count = 0;

        //exit if user enters stop for first location
        if (nextMove.equalsIgnoreCase("stop")) {
            System.exit(0);
        }

        //do while the first locaiton is not stop
        do {
            map = new HashMap<>();
            map.put(nextMove, route);
            route.setName(nextMove);
            locationTrail.add(nextMove);
            ++count;
            route.getName();
            route.setDescription();
            System.out.println(route.getDescription());
            System.out.println("Next location:");
            route.addLocation(nextMove);
            route.listLocations();
            System.out.println("Please choose a next location");
            nextMove = scnr.nextLine();

        } while (!(nextMove.equalsIgnoreCase("stop")));

        
        //do this if do while loop runs at least once and then the user inputs stop to print location tracker
        if (nextMove.equalsIgnoreCase("stop")) {

        //format the file name
        String fileName = String.format("%sLocationLog.txt", name);

        //create an empty output string
        FileOutputStream fileStream = null;

        //try catch for valid file
        try {
            fileStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file name");
        }

        //create new printwriter
        PrintWriter outFS = new PrintWriter(fileStream);
        outFS.println("Here is your location log:");
        for (int i = 0; i < locationTrail.size(); i++) {
            outFS.println(locationTrail.get(i));
        }

        //see if user has passed to print pass/fail
        if (count >= 3){
            outFS.println("You have passed.");
        } else {
            outFS.println("You have not passed.");
        }

        //close the printwriter
        outFS.close();
        }     
    }
}



